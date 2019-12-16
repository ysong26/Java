package MemberManager;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//
//
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : ������
//
//

public class Login_PL3 extends JFrame{
	
	JLabel l_driver,l_ip,l_port,l_db,l_id,l_passwd; //=null�� �ʱ�ȭ ���ϴ����� ?
	Choice ch_driver;
	JTextField txt_ip,txt_port,txt_db,txt_id,txt_passwd;
	JButton bt_login, bt_cancel;
	JPanel label_panel,select_panel,button_panel;

	public Login_PL3() {
		//���̺�
		l_driver=new JLabel("Driver"); //��ü�����Ǹ鼭 ���� �����ⶫ��
		l_ip=new JLabel("IP");
		l_port=new JLabel("Port");
		l_db=new JLabel("DataBase");
		l_id=new JLabel("ID");
		l_passwd=new JLabel("PassWord");
		
		
		//������Ʈ
		ch_driver=new Choice();
		ch_driver.add("������ �����ͺ��̽��� �������ּ���.");
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
	public static void main(String[] args) {
		new Login_PL3();
	}
}
