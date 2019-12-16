package  MemberManager;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Member_ora extends JFrame implements ActionListener {	
	// �����ο� �ʿ��� �༮��~!!
	JLabel m_label, l_name, l_age, l_addr, l_phone, l_phone1, l_phone2, l_email, l_email1, l_gender;
	JTextField txt_name, txt_age, txt_addr, txt_phone1, txt_phone2, txt_phone3, txt_email_id, txt_email_addr, txt_keyword;
	CheckboxGroup gender;
	Checkbox female, male;
	Choice ch_email, ch_category;
	JTable table;
	JScrollPane scroll;
	JButton bt_regist, bt_edit, bt_delete, bt_select, bt_getListAll, bt_exit;
	JPanel south, north, center, p1, p2, p3, p4, p5, p6, p7;

	// 1.JDBC ���ӿ� �ʿ��� �༮��~
	//������ ���̷�Ʈ�� �����ߴ� �༮.. ������ �� ���� LoginŬ������ ���״� ���ƹ�����~
	/*	String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bitna";
		String userid = "root";
		String passwd = "apmsetup";*/
	// String url ="jdbc:mysql://localhost:3306/bitna?useUnicode=true&characterEncoding=utf8";
	
	Login log;//������ �μ��� �޾ƿ� log����~
	String driver, url, userid, passwd;

	Connection con;// ���� ������ ���� ��ü
	PreparedStatement pstmt;
	ResultSet rs;

	// ���� ��ư���� ���� ������ ���� ���� ��Ʈ��
	String g ;
	String sql;	
	String category;

	// ����� ���� ȸ�� ����Ʈ ���� ������ ���� ����������.
	MemberModel model = new MemberModel();
	int selRow; // ���콺 �̺�Ʈ. � ���ڵ带 �����ߴ��� �˼� �ִ� ������.
	int idx; // ���콺�� ���������� idx���� �־�����~!

	public Member_ora(Login log) {
		super("�ڹ� �ּҷ� ���� ���α׷�");		
		this.log=log;		//  �������� �μ��� �Ѿ�� Login ��ü�� �޾ƿ�
		this.con=log.con;// ���� con��ü�� null �̸� �ʵǱ⿡ �־�����~~
		
		m_label = new JLabel("OO�� ���� �ּҷϰ��� ���α׷�");
		Font f1 = new Font("serif", Font.BOLD, 20);
		m_label.setFont(f1);
		m_label.setForeground(Color.WHITE);

		l_name = new JLabel("��    ��");
		l_age = new JLabel(" ��   ��");
		l_addr = new JLabel("��    ��");
		l_phone = new JLabel("����ó");
		l_phone1 = new JLabel("-");
		l_phone2 = new JLabel("-");
		l_email = new JLabel("�̸���");
		l_email1 = new JLabel("@");
		l_gender = new JLabel(" ��   ��");

		txt_name = new JTextField(8);
		txt_age = new JTextField(3);
		txt_addr = new JTextField(30);
		txt_phone1 = new JTextField(9);
		txt_phone2 = new JTextField(9);
		txt_phone3 = new JTextField(9);
		txt_email_id = new JTextField(9);
		txt_email_addr = new JTextField(10);
		txt_keyword = new JTextField(10);
		
		ch_email = new Choice();
		ch_email.add("�����Է�");
		ch_email.add("naver.com");
		ch_email.add("google.com");
		ch_email.add("nate.com");
		ch_email.add("paran.com");
		ch_email.add("hanmail.net");
		
		ch_category=new Choice();
		ch_category.add("�˻��� ī�װ��� �����ϼ���");
		ch_category.add("name");
		ch_category.add("age");
		ch_category.add("gender");
		ch_category.add("addr");
		ch_category.add("phone");
		ch_category.add("email");

		gender = new CheckboxGroup();
		male = new Checkbox("Male", gender, false);
		female = new Checkbox("Female", gender, false);

		bt_regist = new JButton("���");
		bt_edit = new JButton("����");
		bt_delete = new JButton("����");
		bt_select = new JButton("��ȸ");
		bt_getListAll = new JButton("��ü��ȸ");
		bt_exit = new JButton("����");

		table = new JTable(model);		
		scroll = new JScrollPane(table);

		south = new JPanel();
		north = new JPanel();
		center = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6= new JPanel();
		

		north.setPreferredSize(new Dimension(600, 200));
		center.setPreferredSize(new Dimension(600, 400));
		south.setPreferredSize(new Dimension(600, 50));

		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);		
		
		north.setLayout(new GridLayout(6, 1));
		north.add(p1);
		north.add(p2);
		north.add(p3);
		north.add(p4);
		north.add(p5);
		north.add(p6);

		p1.setBackground(Color.BLACK);
		p1.add(m_label);
		p2.add(l_name);
		p2.add(txt_name);
		p2.add(l_age);
		p2.add(txt_age);
		p2.add(l_gender);
		p2.add(male);
		p2.add(female);
		p3.add(l_addr);
		p3.add(txt_addr);
		p4.add(l_phone);
		p4.add(txt_phone1);
		p4.add(l_phone1);
		p4.add(txt_phone2);
		p4.add(l_phone2);
		p4.add(txt_phone3);
		p5.add(l_email);
		p5.add(txt_email_id);
		p5.add(l_email1);
		p5.add(txt_email_addr);
		p5.add(ch_email);

		p6.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p6.setBackground(Color.pink);
		p6.add(ch_category);
		p6.add(txt_keyword);
		p6.add(bt_select);
		p6.add(bt_getListAll);

		// �����ּ� ���̽� �ڽ� ������ ����..
		ch_email.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Object obj = ie.getSource();
				if (obj.equals(ch_email)) {
					if (ch_email.getSelectedIndex() == 0) {
						txt_email_addr.setText("");
					} else {
						// txt_email_addr.setText(ch_email.getSelectedItem());
						txt_email_addr.setText((String) ie.getItem());
					}
				}
			}
		});
		
		// �˻� ī�װ� ���̽� �ڽ� ������ ����..
				ch_category.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent ie) {
						Object obj = ie.getSource();
						category=(String)ie.getItem();
					}
				});

		// ���� checkbox ������ ����
		male.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				g = (String) e.getItem();
				// g = gender.getSelectedCheckbox().getLabel();
			}
		});

		female.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				g = (String) e.getItem();
				// g = gender.getSelectedCheckbox().getLabel();
			}
		}); // ���� checkbox ������ ���� ��

		center.setLayout(new GridLayout(1, 1));
		center.add(scroll);
		table.setAutoCreateRowSorter(true); //���ñ��
		

		south.setLayout(new GridLayout(1, 4));
		south.add(bt_regist);
		south.add(bt_edit);
		south.add(bt_delete);
		south.add(bt_exit);
		

		// ��ư�� �׼� ������ �޾��ֱ�
		bt_regist.addActionListener(this);
		bt_edit.addActionListener(this);
		bt_delete.addActionListener(this);
		bt_select.addActionListener(this);
		bt_getListAll.addActionListener(this);
		bt_exit.addActionListener(this);

		// ���̺� �����Ͽ� ���콺 �̺�Ʈ ��������
		// ��� row�� ���������� �Ǵ�.
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				selRow = table.getSelectedRow();
				//System.out.println(selRow);

				/*���ý� ������ ���� �ؽ�Ʈ ���ڵ鿡�� �־�����~! ������Ʈ ���̴� ����ȯ~~*/
				String name = (String) table.getValueAt(selRow, 0);
				String age = table.getValueAt(selRow, 1).toString();
				String gender = (String) table.getValueAt(selRow, 2);
				String addr = (String) table.getValueAt(selRow, 3);
				String phone = (String) table.getValueAt(selRow, 4);
				String email = (String) table.getValueAt(selRow, 5);

				// idx�� ���̺� ����. �𵨿��� ����? ������ rs������ �־�������.. model���� ��������!!
				idx = (Integer) model.getValueAt(selRow, 6);
				//System.out.println(idx);

				txt_name.setText(name);
				txt_age.setText(age);
				txt_addr.setText(addr);
				//System.out.println(gender);
				if(gender==null){
					male.setState(false);
					female.setState(false);
				}else {
					 if (gender.equals("Male")){
						 male.setState(true);
					 }else if (gender.equals("Female")) {
						 female.setState(true);
					 }
				}				
				txt_phone1.setText(phone.substring(0, phone.indexOf("-")));
				txt_phone2.setText(phone.substring(phone.indexOf("-") + 1, phone.lastIndexOf("-")));
				txt_phone3.setText(phone.substring(phone.lastIndexOf("-") + 1));
				txt_email_id.setText(email.substring(0, email.indexOf("@")));
				txt_email_addr.setText(email.substring(email.lastIndexOf("@")+1));
			}
		});

		// ������ â ������ DB�� ������ ��� �ڿ��� ����!!
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				closeDB();
				System.exit(0);
			}
		}); // end windowListner

		
		/* log�� ������ �ִ� con(���� ������ ������ �ִ� �༮)������ ���� null�� �ƴ��� �˻��ؼ� 
		 * null�� �ƴ϶�� ������ �����Ѱ��̴�  ����Ʈ �������� �޼��带 ��������. */
		if(log.con!=null) {
			JOptionPane.showMessageDialog(getParent(), "���Ӽ���������, ����Ʈ�� ��������~~");
			if(getListAll()){// ����Ʈ ��������
		
			}else{
				JOptionPane.showMessageDialog(getParent(), "����Ʈ �������� ����!");				
			}
		}else{
			JOptionPane.showMessageDialog(getParent(), "���ӽ���");
		}
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setSize(600, 650);
		pack();
		
		
		//ȭ�� �����..
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();    
		  int xPos = screenSize.width/2 - getSize().width/2 ;
		  int yPos = screenSize.height/2 - getSize().height/2 ;  
		  setLocation(xPos,yPos);
	
		setVisible(true);
	}
	// end ������
	// ���ӽõ� �޼ҵ�
	public boolean connect() {
		boolean isConnect = false;
		try {
			// ���� ����̹� �ε�
			Class.forName(driver);
			// ���� �õ�
			con = DriverManager.getConnection(url, userid, passwd);		
			isConnect = true;			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return isConnect;
	}
	// ����Ʈ ��������
	public boolean getListAll() {
		boolean result = false;
		String sql = "select * from member order by idx desc";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			/* ���̺� �𵨿��� ������ �������ֱ� 
			 * 1) vector�� ����ȯ 
			 * 2)list ������ ������ �ִ� ����(����~~����� ������ �ǰڳ�)*/
			Vector list = new Vector();
			while (rs.next()) {
				// �ѻ�� ������ ���� vector�� ������!(���ι���) ������ ����~!
				Vector record = new Vector();
				record.add(rs.getString("name"));
				record.add(rs.getInt("age"));
				record.add(rs.getString("gender"));
				record.add(rs.getString("addr"));
				record.add(rs.getString("phone"));
				record.add(rs.getString("email"));
				record.add(rs.getInt("idx")); // ���� idx�� ���ܼ�~~!
				// �ѻ���� ������ ���� ���͸� �� ū ���Ϳ� ��� �ִ�.
				list.add(record);
			}
			// ���̺� �𵨿� ��� ������ ū ���͸� �ѱ���!!
			model.setList(list);
			this.repaint();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}	
	
	// ���ڵ� ���
	public int regist() {		
		int result = 0;
		sql = "Insert into member(idx,name,age,gender,addr,phone,email)";
		sql = sql + "Values(seq_member.nextval,?,?,?,?,?,?)";	
		
			try {			
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, txt_name.getText());
				// pstmt.setString(1, new String(txt_name.getText().getBytes(), "euc-kr"));
				pstmt.setInt(2, Integer.parseInt(txt_age.getText()));
				pstmt.setString(3, g);
				// pstmt.setString(4, new String(txt_addr.getText().getBytes(), "ISO-8859-1"));
				pstmt.setString(4, txt_addr.getText());
				pstmt.setString(5, txt_phone1.getText()+"-"+ txt_phone2.getText()+"-"+txt_phone3.getText());
				pstmt.setString(6,txt_email_id.getText()+"@"+txt_email_addr.getText());
				result = pstmt.executeUpdate();
				// System.out.println(new String(txt_addr.getText().getBytes("euc-kr"),"utf-8"));
			} catch (SQLException e) {
				e.printStackTrace();
			} 		
		//}
		return result;
	}

	// ���� �޼��� ����
	public int delete() {
		int result = 0;
		String sql = "Delete member where idx=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return result;
	}
	
	public int edit(){
		int result =0;
		String sql = "Update member set name=?, age=?, gender=?, addr=?, phone=?, email=? where idx=?";
		try {
			pstmt = con.prepareStatement(sql);			
			pstmt.setString(1, txt_name.getText());
			pstmt.setInt(2, Integer.parseInt(txt_age.getText()));
			pstmt.setString(3, g);
			pstmt.setString(4, txt_addr.getText());
			pstmt.setString(5,	txt_phone1.getText() + "-" + txt_phone2.getText() +"-"+ txt_phone3.getText());
			pstmt.setString(6,	txt_email_id.getText() + "@" + txt_email_addr.getText());
			pstmt.setInt(7, idx);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//�˻� �޼ҵ�	
	public boolean select(String category, String keyword){
		boolean result = false;
		String sql ="select * from member where "+category+" like '%"+keyword+"%' order by idx desc";		
		//System.out.println(sql);
		try {
			pstmt=con.prepareStatement(sql);
			rs = pstmt.executeQuery();			
			Vector list = new Vector();
			while (rs.next()) {
				// �ѻ�� ������ ���� vector�� ������!(���ι���) ������ ����~!
				Vector record = new Vector();
				record.add(rs.getString("name"));
				record.add(rs.getInt("age"));
				record.add(rs.getString("gender"));
				record.add(rs.getString("addr"));
				record.add(rs.getString("phone"));
				record.add(rs.getString("email"));
				record.add(rs.getInt("idx")); 
				list.add(record);
			}
			// ���̺� �𵨿� ��� ������ ū ���͸� �ѱ���!!
			model.setList(list);
			this.repaint();
			result = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	//�ؽ�Ʈ ���� �ʱ�ȭ �ϴ� �޼���
	public void clear(){		
		txt_name.setText("");
		txt_age.setText(""); 
		male.setState(false);
		female.setState(false);
		txt_addr.setText(""); 
		txt_phone1.setText(""); txt_phone2.setText(""); txt_phone3.setText("");
		txt_email_id.setText(""); txt_email_addr.setText("");
		txt_name.requestFocus();
	}

	//��ȿ�� �˻�
	public boolean check(){
		boolean result =false;
		//�̸� ��ȿ�� �˻�
		if(txt_name.getText()==null || txt_name.getText().length()==0){
			JOptionPane.showMessageDialog(getParent(), "�̸��� �ʼ��׸��Դϴ�.");
			txt_name.setText("");
			txt_name.requestFocus();
			//return result;

		}else if (txt_name.getText().length()>20){
			JOptionPane.showMessageDialog(getParent(), "�̸��� 20�� �̳��� �Է����ּ���");
			txt_name.setText("");
			txt_name.requestFocus();						
			//return result;
			// ���� ��ȿ��
		} else if(txt_age.getText().length()>3 || txt_age.getText().matches("[0-9]")) {
			JOptionPane.showMessageDialog(getParent(), "���̸� ��Ȯ�� �Է����ּ���");
			txt_age.setText("");
			txt_age.requestFocus();
			//return result;
		}
		
		//��ȭ��ȣ�� ���ڸ� �Է°����ϵ���
		else if (txt_phone1.getText().length()>4 || txt_phone2.getText().length()>4 || txt_phone3.getText().length()>4 || txt_phone1.getText().matches("[0-9]")||txt_phone2.getText().matches("[0-9]")||txt_phone3.getText().matches("[0-9]")) {
			JOptionPane.showMessageDialog(getParent(), "��ȭ��ȣ�� ��Ȯ�� �Է����ּ���.");
			txt_phone1.setText("");
			txt_phone2.setText("");
			txt_phone3.setText("");
			txt_phone1.requestFocus();
			//return result;
		}
		//�̸��� ��ȿ�� �˻�
		else if(txt_email_id.getText().length()>40 || txt_email_addr.getText().length()>40){
			JOptionPane.showMessageDialog(getParent(), "�̸����� ��Ȯ�� �Է����ּ���.");
			txt_email_id.setText("");
			txt_email_addr.setText("");
			txt_email_id.requestFocus();
			//return result;			
		}else{
			result = true;
		}
		return result;
	}
	
	// �����ͺ��̽� �������� �޼��� ����!!
	public void closeDB() {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}	

	// ��ư �׼� �̺�Ʈ ����
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		// ��Ϲ�ư
		if (obj.equals(bt_regist)) {
			if(check()){
				// ��ϸ޼��� ����~
				int result = regist();
				if (result != 0) {
					JOptionPane.showMessageDialog(getParent(), "��ϼ���");
					getListAll();
					clear();
					table.updateUI();
				} else {
					JOptionPane.showMessageDialog(getParent(), "��Ͻ���");
				}
			}
		}
		
		// ������ư
		if (obj.equals(bt_edit)) {
			if(check()){
				if(JOptionPane.showConfirmDialog(getParent(),	(String)table.getValueAt(selRow, 0)+ "���� ������ ���� �Ͻðڽ��ϱ�?")==0){
					int result = edit();
					if(result !=0){
						getListAll();
						clear();
						table.updateUI();
					}else{
						JOptionPane.showMessageDialog(getParent(), "���� ����");
					}
				}
			}
		}
		// ������ư
		if (obj.equals(bt_delete)) {
			if(JOptionPane.showConfirmDialog(getParent(),	(String) table.getValueAt(selRow, 0)+ "���� ������ ���� �Ͻðڽ��ϱ�?")==0){
				int result = delete();
				if (result != 0) {
					getListAll();
					clear();
					table.updateUI();			
				}
			}
		}

		// ��ȸ��ư
		if (obj.equals(bt_select)) {
			if(select(category, txt_keyword.getText())){
				
			}else{
				JOptionPane.showMessageDialog(getParent(), "�˻��� �����Ͽ����ϴ�.");
			};
		}
		
		// ��ü ��ȸ��ư
		if (obj.equals(bt_getListAll)) {
			getListAll();
		}

		// �����ư
		if (obj.equals(bt_exit)) {
			closeDB();
			System.exit(0);

		}// end exit��ư action����
	}// end action�̺�Ʈ ����

	// ���� �޼���
/*	public static void main(String[] args) {
		Member m = new Member();

	}*/

}// end class
