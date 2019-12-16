package MemberManager;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//
//
//  @ Project : �ּҰ��� ���α׷�
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : ������
//
//

public class Login_PL2 extends JFrame{
	
	JLabel l_driver; //=null�� �ʱ�ȭ ���ϴ����� ? 
	Choice ch_driver;
	JPanel label_panel;
	JPanel select_panel;

	public Login_PL2() {
		//���̺�
		l_driver=new JLabel("Driver"); //��ü�����Ǹ鼭 ���� �����ⶫ��
		
		//������Ʈ
		ch_driver=new Choice();
		ch_driver.add("������ �����ͺ��̽��� �������ּ���.");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		//�г��ۼ�
		label_panel=new JPanel();
		select_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		label_panel.add(l_driver);
		
		select_panel.add(ch_driver);
		
		//������ ��
		add(label_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		
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
		new Login_PL2();
	}
}
