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
import javax.swing.JPanel;
import javax.swing.JTextField;

//
//
//  @ Project : 주소관리 프로그램
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : 홍길동
//
//

public class Login_PL4 extends JFrame implements ActionListener, ItemListener{
	
	JLabel l_driver,l_ip,l_port,l_db,l_id,l_passwd; //=null로 초기화 안하는이유 ?
	Choice ch_driver;
	JTextField txt_ip, txt_port,txt_db,txt_id,txt_passwd;
	JButton bt_login, bt_cancel;
	JPanel label_panel,select_panel,button_panel;
	String url,driver, id, passwd;
	Connection con;
	

	public Login_PL4() {
		//레이블
		l_driver=new JLabel("Driver"); //객체생성되면서 값이 들어오기땜에
		l_ip=new JLabel("IP");
		l_port=new JLabel("Port");
		l_db=new JLabel("DataBase");
		l_id=new JLabel("ID");
		l_passwd=new JLabel("PassWord");
		
		
		//컴포넌트
		ch_driver=new Choice();
		ch_driver.add("접속할 데이터베이스를 선택해 주세요");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		txt_ip=new JTextField(30);
		txt_port=new JTextField(30);
		txt_db=new JTextField(30);
		txt_id=new JTextField(30);
		txt_passwd=new JTextField(30);
		
		bt_login=new JButton("연결");
		bt_cancel=new JButton("취소");
		
		
		//패널작성
		label_panel=new JPanel();
		select_panel=new JPanel();
		button_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		button_panel.setPreferredSize(new Dimension(400,50));
		
		label_panel.setLayout(new GridLayout(6,1,10,10)); //행6 열1
		select_panel.setLayout(new GridLayout(6,1,10,10)); //행6 열1
		
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
		
		
		//프레임 셋
		add(label_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);
		
		//이벤트 리스터 처리
		bt_login.addActionListener(this);
		bt_cancel.addActionListener(this);
		ch_driver.addItemListener(this);
		
		//종료
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		
		//화면에 프리젠테이션 (가운데에 실행됨)
		this.setLocation(((this.getToolkit().getScreenSize()).width-this.getWidth())/2,
				((this.getToolkit().getScreenSize()).height-this.getHeight())/2
				);
		
		setVisible(true);
	}
	
	//엔트리 함수
	public static void main(String[] agrs) {
		new Login_PL4();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		getDBMStype(ch_driver.getSelectedIndex(),null,null,null,null,null);
		
	}

	private HashMap<String, String> getDBMStype(int index, String ip, String port, String dbname, String id,
			String pass) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		//아무것도 선택하지 않았을 때
		if(index==0) {
			map.put("driver","");
			map.put("ip",ip=(ip==null)?"":ip);
			map.put("port",port=(port==null)?"":port);
			map.put("dbname",dbname=(dbname==null)?"":dbname);
			map.put("id",id=(id==null)?"":id);
			map.put("pass",pass=(pass==null)?"":pass);
			url="";			
		}
		
		//MySql을 선택했을 때
		
		if(index==1) {
			map.put("driver","com.mysql.cj.jdbc.Driver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"3306":port);
			map.put("dbname",dbname=(dbname==null)?"db_money?serverTimezone=UTC":dbname);
			map.put("id",id=(id==null)?"iot2":id);
			map.put("pass",pass=(pass==null)?"1234":pass);
			url="jdbc:mysql:"+"//"+ip+":"+port+"/"+dbname;		
			
		}
		//Oracle을 선택했을 때
		if(index==2) {
			map.put("driver","oracle.jdbc.driver.OracleDriver");
			map.put("ip",ip=(ip==null)?"127.0.0.1":ip);
			map.put("port",port=(port==null)?"1521":port);
			map.put("dbname",dbname=(dbname==null)?"xe":dbname); //인스턴스이름
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
	
	private String connect() {
		id=txt_id.getText();
		passwd=txt_passwd.getText();
		
		try {
			Class.forName(driver);
			System.out.println(driver);
			//접속 시도
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
		Object obj=e.getSource(); //최상위 오브젝트 클래스
		
		//로그인
		if(obj.equals(bt_login)) {
			if(connect().equals("com.mysql.jdbc.Driver")) {
				System.out.println("MySql 접속 성공");
			}
			if(connect().equals("oracle.jdbc.driver.OracleDriver")) {
				System.out.println("Oracle 접속 성공");
			}
		}
		
		//취소
		if(obj.equals(bt_cancel)) {
			
		}
		
	}


}









