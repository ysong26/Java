package MemberManager;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

//
//
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : ȫ�浿
//
//

public class Login_PL extends JFrame implements ActionListener, ItemListener{
	
	JLabel l_driver,l_ip,l_port,l_db,l_id,l_passwd; //=null�� �ʱ�ȭ ���ϴ����� ?
	Choice ch_driver;
	JTextField txt_ip, txt_port,txt_db,txt_id,txt_passwd;
	JButton bt_login, bt_cancel;
	JPanel label_panel,select_panel,button_panel;
	String url,driver, id, passwd;
	Connection con;
	

	public Login_PL() {
		//���̺�
		l_driver=new JLabel("Driver"); //��ü�����Ǹ鼭 ���� �����ⶫ��
		l_ip=new JLabel("IP");
		l_port=new JLabel("Port");
		l_db=new JLabel("DataBase");
		l_id=new JLabel("ID");
		l_passwd=new JLabel("PassWord");
		
		
		//������Ʈ
		ch_driver=new Choice();
		ch_driver.add("������ �����ͺ��̽��� ������ �ּ���");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		txt_ip=new JTextField(30);
		txt_port=new JTextField(30);
		txt_db=new JTextField(30);
		txt_id=new JTextField(30);
		txt_passwd=new JTextField(30);
		
		bt_login=new JButton("����");
		bt_cancel=new JButton("���");
		
		
		//�г��ۼ�
		label_panel=new JPanel();
		select_panel=new JPanel();
		button_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		button_panel.setPreferredSize(new Dimension(400,50));
		
		label_panel.setLayout(new GridLayout(6,1,10,10)); //��6 ��1
		select_panel.setLayout(new GridLayout(6,1,10,10)); //��6 ��1
		
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
		
		
		//������ ��
		add(label_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);
		
		//�̺�Ʈ ������ ó��
		bt_login.addActionListener(this);
		bt_cancel.addActionListener(this);
		ch_driver.addItemListener(this);
		
		//����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		
		//ȭ�鿡 ���������̼� (����� �����)
		this.setLocation(((this.getToolkit().getScreenSize()).width-this.getWidth())/2,
				((this.getToolkit().getScreenSize()).height-this.getHeight())/2
				);
		
		setVisible(true);
	}
	
	//��Ʈ�� �Լ�
	public static void main(String[] agrs) {
		new Login_PL();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		getDBMStype(ch_driver.getSelectedIndex(),null,null,null,null,null);
		
	}

	private HashMap<String, String> getDBMStype(int index, String ip, String port, String dbname, String id,
			String pass) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		//�ƹ��͵� �������� �ʾ��� ��
		if(index==0) {
			map.put("driver","");
			map.put("ip",ip=(ip==null)?"":ip);
			map.put("port",port=(port==null)?"":port);
			map.put("dbname",dbname=(dbname==null)?"":dbname);
			map.put("id",id=(id==null)?"":id);
			map.put("pass",pass=(pass==null)?"":pass);
			url="";			
		}
		
		//MySql�� �������� ��
		
		if(index==1) {
			map.put("driver","com.mysql.cj.jdbc.Driver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"3306":port);
			map.put("dbname",dbname=(dbname==null)?"db_money?serverTimezone=UTC":dbname);
			map.put("id",id=(id==null)?"iot2":id);
			map.put("pass",pass=(pass==null)?"1234":pass);
			url="jdbc:mysql:"+"//"+ip+":"+port+"/"+dbname;		
			
		}
		//Oracle�� �������� ��
		if(index==2) {
			map.put("driver","oracle.jdbc.driver.OracleDriver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"1521":port);
			map.put("dbname",dbname=(dbname==null)?"xe":dbname); //�ν��Ͻ��̸�
			map.put("id",id=(id==null)?"aaa":id);
			map.put("pass",pass=(pass==null)?"bbb":pass);
			url="jdbc:oracle:thin:"+"@"+ip+":"+port+":"+dbname;
		}
		
		driver=map.get("driver");
		
		txt_ip.setText(ip);
		txt_port.setText(port);
		txt_db.setText(dbname);
		txt_id.setText(id);
		txt_passwd.setText(pass);
		
		return map;		
	}
	
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
	
		connect();
	}

	public String connect() {
		id=txt_id.getText();
		passwd=txt_passwd.getText();
		
		try {
			Class.forName(driver);
			System.out.println(driver);
			//���� �õ�
			con=DriverManager.getConnection(url,id,passwd);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return driver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource(); //�ֻ��� ������Ʈ Ŭ����
		
		//�α���
		if(obj.equals(bt_login)) {
			
			check();
			//��ȿ�� ó�� ��� �ϰ� ����...
			
			if(con!=null) {
				if(connect().equals("com.mysql.jdbc.Driver")) {
					MemberMySql m=new MemberMySql(this);
				}
				if(connect().equals("oracle.jdbc.driver.OracleDriver")) {
					MemberOracle m=new MemberOracle(this);
				}
				
				this.setVisible(false);
				
			}
	
			
		}
		
		//���
		if(obj.equals(bt_cancel)) {
			System.exit(0);
		}
		
	}




}









