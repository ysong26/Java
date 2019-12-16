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
//  @ Project : 주소관리 프로그램
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : 서예송
//
//

public class Login_PL2 extends JFrame{
	
	JLabel l_driver; //=null로 초기화 안하는이유 ? 
	Choice ch_driver;
	JPanel label_panel;
	JPanel select_panel;

	public Login_PL2() {
		//레이블
		l_driver=new JLabel("Driver"); //객체생성되면서 값이 들어오기땜에
		
		//컴포넌트
		ch_driver=new Choice();
		ch_driver.add("접속할 데이터베이스를 선택해주세요.");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		//패널작성
		label_panel=new JPanel();
		select_panel=new JPanel();
		
		label_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		
		label_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		label_panel.add(l_driver);
		
		select_panel.add(ch_driver);
		
		//프레임 셋
		add(label_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		
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
	public static void main(String[] args) {
		new Login_PL2();
	}
}
