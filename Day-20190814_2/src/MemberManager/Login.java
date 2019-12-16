package  MemberManager;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener, ItemListener{
	JLabel l_driver, l_ip, l_port, l_db, l_id, l_passwd;
	JTextField txt_ip, txt_port, txt_db, txt_id, txt_passwd;
	Choice ch_driver;
	JButton bt_login, bt_cancel;
	JPanel label_panel, select_panel , button_panel;
	String driver, url, id, passwd;
	Connection con;
	
	public Login(){
		l_driver = new JLabel("Driver"); 
		l_ip = new JLabel("IP"); 
		l_port = new JLabel("Port"); 
		l_db = new JLabel("DataBase");
		l_id = new JLabel("ID");
		l_passwd = new JLabel("PassWord");
		
		txt_ip = new JTextField(30);
		txt_port = new JTextField(30);
		txt_db = new JTextField(30);
		txt_id = new JTextField(30);
		txt_passwd = new JTextField(30);

		ch_driver = new Choice();
		ch_driver.add("������ �����ͺ��̽��� �����ϼ���");
		ch_driver.add("Oracle");
		ch_driver.add("MySql");
		
		bt_login = new JButton("����");
		bt_cancel=new JButton("���");
		
		label_panel=new JPanel();
		select_panel= new JPanel();
		button_panel = new JPanel();
	
		label_panel.setPreferredSize(new Dimension(100, 200));
		select_panel.setPreferredSize(new Dimension(300, 200));
		button_panel.setPreferredSize(new Dimension(400, 50));
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));

		label_panel.add(l_driver);
		label_panel.add(l_ip);
		label_panel.add(l_port);
		label_panel.add(l_db);
		label_panel.add(l_id);
		label_panel.add(l_passwd);
		
		select_panel.add(ch_driver);
		select_panel.add(txt_ip);
		select_panel.add(txt_port);
		select_panel.add(txt_db);
		select_panel.add(txt_id);
		select_panel.add(txt_passwd);
		
		button_panel.add(bt_login);
		button_panel.add(bt_cancel);
		
		add(label_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);	
		
		bt_login.addActionListener(this);
		bt_cancel.addActionListener(this);
				
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		//������ �����
		this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			}); // end windowListner

		ch_driver.addItemListener(this);
		
		pack();		
		this.setLocation( ((this.getToolkit().getScreenSize()).width - this.getWidth())/2,  ((this.getToolkit().getScreenSize()).height - this.getHeight())/2);
		setVisible(true);
		
			
	}	

	/* ����Ŭ �̳� mysql�̳Ŀ� ���� �ּ� �ϼ�~!
	 * DBMS���ÿ� ���� �ʿ��� �����Ͱ� ������(ip, port, id, ���)�̹Ƿ� ��ȯ���� ��(hash map)���� ����!(�����͸� �ָӴϿ� �ְ� �ٴϸ� �� ��������?)
		������ item�� index �� ���� �˸´� DBMS ������ �����Ͽ� ������ ��ȯ���ִ� �޼��忡��~
		�� �޼��带 ȣ���ϴ� ����� ������ ���ƿ�~
		(�μ�1) index : ������ choice ������Ʈ index �� �� � DBMS �� ���ϴ���~~�� ����^^
		(�μ�2) ip : ������ DBMS ���ӿ� ����� ip , ���� ����Ʈ �ּҸ� ���ϸ� null �� �ѱ� 
		(�μ�3) port : ������ DBMS �� ����� port ��ȣ, ���� ����Ʈ ��Ʈ��ȣ�� ���ϸ� null �� �ѱ�
		(�μ�4) dbname : ������ DBMS �� ����� DB�̸� ,  ���� ����Ʈ ������ ���ϸ� null �� �ѱ�
		(�μ�5) id : ������ DBMS �� ����� ���̵� , ���� ����Ʈ ���̵� ���ϸ� null �� �ѱ�
		(�μ�6) pass : ������ DBMS �� ����� ��й�ȣ, ���� ����Ʈ ����� ���ϸ� null �� �ѱ�*/
	public HashMap<String,String> getDBMStype(int index,String ip, String port, String dbname,String id,String pass){
		HashMap<String,String> map=new HashMap<String,String>();
		
		//�ƹ��͵� �������� ���� 
		if(index==0) {
			map.put("driver","");
			map.put("ip",ip=(ip==null)?"":ip);
			map.put("port",port=(port==null)?"":port);
			map.put("dbname",dbname=(dbname==null)?"":dbname);
			map.put("id",id=(id==null)?"":id);
			map.put("pass",pass=(pass==null)?"":pass);
			url="";
		}
		
		//����Ŭ�� ������ 
		if(index==1) {
			map.put("driver","oracle.jdbc.driver.OracleDriver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"1521":port);
			map.put("dbname",dbname=(dbname==null)?"xe":dbname); //�ν��Ͻ��̸�
			map.put("id",id=(id==null)?"aaa":id);
			map.put("pass",pass=(pass==null)?"bbb":pass);
			url="jdbc:oracle:thin:"+"@"+ip+":"+port+":"+dbname;
		}
		
		//MySQL�� ������
		if(index==2){
			map.put("driver", "com.mysql.jdbc.Driver");
			map.put("ip", ip=(ip==null)? "localhost":ip);
			map.put("port", port=(port==null)? "3306":port);
			map.put("dbname",dbname=(dbname==null)?"db_money?serverTimezone=UTC":dbname);
			map.put("id",id=(id==null)?"iot2":id);
			map.put("pass",pass=(pass==null)?"1234":pass);
			
			url="jdbc:mysql:"+"//"+ip+":"+port+"/"+dbname;	
		}

		//����̹� ��������� ���� ����� DBMS�� ����̹� ���� ����~!!
		driver=map.get("driver");
		
		//�ؽ�Ʈ ������Ʈ�� ���	(�Է����Ǽ��� ���� ���������~ ������)
		txt_ip.setText(ip);
		txt_port.setText(port);
		txt_db.setText(dbname);
		txt_id.setText(id);
		txt_passwd.setText(pass);		
		return map;
	}
	
	public void itemStateChanged(ItemEvent e) {
		/*���̽� ������Ʈ���� DBMS ���ý� ����Ʈ�� ������ ������ �ƹ��͵� �ѱ� �ʿ䰡 ����.. 
		 * �ε��� ��ȣ�� �Ѱܼ� ���� ü����~!
		 		�α��� ��ư �����ÿ� ���� ������  ������ �ѱ��� */
		getDBMStype(ch_driver.getSelectedIndex(),null, null, null,null,null);
	}	
	
	/*��ȿ�� �˻�
	 * ��ȿ���� ���� ������ ���� ��� ��� �� �̻� ����ΰ� ������� �ʵ��� return ���� ó���߾��.
	 * �˻�� �޼��� ���� �ϴ°͵� �� �ȿ��� �� ������~ �׷� ��ȯ���� �ʿ�����ϱ� void�� �ǰ���? �� ��ȯ�� ���̵��� �޼��尡 �� ������>_<*/
	public void check() {
		//������ ��ȿ�� üũ
		if(txt_ip.getText()==null || txt_ip.getText().length()==0 || txt_ip.getText().length() > 40) {
			JOptionPane.showMessageDialog(getParent(), "�����Ǹ� ��Ȯ�� �Է����ּ���. ex:127.0.0.1 �Ǵ� localhost");
			txt_ip.setText("");
			txt_ip.requestFocus();
			return;
		}
		
		//��Ʈ ��ȿ�� üũ
		if (txt_port.getText()==null || txt_port.getText().length()==0||txt_port.getText().length()>4 || txt_port.getText().matches("[0-9]")){
			JOptionPane.showMessageDialog(getParent(), "��Ʈ��ȣ�� ��Ȯ�� �Է����ּ���. ex:3306 �Ǵ� 1521");
			txt_port.setText("");
			txt_port.requestFocus();
			return;
		}
		//�����ͺ��̽� ��ȿ�� üũ
		if (txt_db.getText()==null || txt_db.getText().length()==0||txt_db.getText().length()>40){
			JOptionPane.showMessageDialog(getParent(), "�����ͺ��̽��� ��Ȯ�� �Է����ּ���.");
			txt_db.setText("");
			txt_db.requestFocus();						
			return;
		}
		//���̵� ��ȿ�� üũ
		if (txt_id.getText()==null || txt_id.getText().length()==0||txt_id.getText().length()>20){
			JOptionPane.showMessageDialog(getParent(), "���̵� ��Ȯ�� �Է����ּ���.");
			txt_id.setText("");
			txt_id.requestFocus();						
			return;
		}
		//��й�ȣ ��ȿ�� üũ
		if (txt_passwd.getText()==null || txt_passwd.getText().length()==0||txt_passwd.getText().length()>20){
			JOptionPane.showMessageDialog(getParent(), "��й�ȣ�� ��Ȯ�� �Է����ּ���.");
			txt_passwd.setText("");
			txt_passwd.requestFocus();
			return;
		}
		
		
		getDBMStype(ch_driver.getSelectedIndex(),txt_ip.getText(),txt_port.getText(),txt_db.getText(),txt_id.getText(),txt_passwd.getText());
		System.out.println("URL ��:"+url);
		//�ڹٽ�ũ��Ʈ ó��, ��ȿ���� ��� ������ ��ģ ��츸 �Ʒ��� ���� ��ȸ�� �����~~? 
		connect();
	}
		

	/*---------------------------------------------------------------------------------------------------
	 * ���ӽõ� �޼ҵ�
	 * ���ӽõ� �޼��忡�� ������ �õ��ߴ��� ���θ� ��ȯ���ִ� �͵� ������ , 
	 * ������ ������ �����ϰ� �Ǹ� con �� null�� �ƴ϶� Ư�� �ּҰ��� ������� ���̱� ������ 
	 * ��� ������ con �� ����ϴ� �ٸ� �ڵ忡�� con�� null ���� , �ƴ��� �Ǵ��ϸ鼭 ������ �ۼ��ϸ� �Ǳ� ������
	 *  ���� �޼���� void �� ���ϴ�.
	 * ���� ���, �Ʒ� actionPerformed �޼��忡�� �α��� ��ư�� ������ con �� ���� ���¸� �ľ��ذ��鼭 ������ �ۼ��ϸ� �ǰ���?^__^ 
	---------------------------------------------------------------------------------------------------*/
	public String connect() {
		id=txt_id.getText();
		passwd=txt_passwd.getText();
		
		try {
			// ���� ����̹� �ε�
			Class.forName(driver);
			System.out.println(driver);
			// ���� �õ�
			con = DriverManager.getConnection(url, id, passwd);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return driver;
	}

		
	//��ư �̺�Ʈ ����
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj.equals(bt_login)){
			check();			
			//������ �����ߴٸ� ~~
			if(con!=null){
				//member�� �����Ҷ� �α��� ������ �Ѱ�����~~
				if(connect().equals("oracle.jdbc.driver.OracleDriver")){
					Member_ora m=new Member_ora(this); 
				}
				if(connect().equals("com.mysql.jdbc.Driver")){
					Member m = new Member(this);
				}
				this.setVisible(false);
			}
		}
		
		if(obj.equals(bt_cancel)){
			System.exit(0);
		}
	}	

	public static void main(String[] args) {
		new Login();
	}

}
