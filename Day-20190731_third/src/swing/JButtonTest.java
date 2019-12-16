package swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame {

	public JButtonTest() {
		super("버튼 테스트");
		JPanel buttonPanel=new JPanel();
		JButton btn=new JButton("버튼");
		buttonPanel.add(btn);
		
		JToggleButton tgbutton=new JToggleButton("아이콘");
		buttonPanel.add(tgbutton);
		
		JLabel lblHobby=new JLabel("취미");
		buttonPanel.add(lblHobby);
		
		JCheckBox check1=new JCheckBox("운동");
		JCheckBox check2=new JCheckBox("독서");
		JCheckBox check3=new JCheckBox("영화감상");
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
	
		JLabel lblMale=new JLabel("성별");
		
		JRadioButton rb1=new JRadioButton("남자");
		JRadioButton rb2=new JRadioButton("여자");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		buttonPanel.add(lblMale);
		buttonPanel.add(rb1);
		buttonPanel.add(rb2);
		
		add(buttonPanel);
		
		setLocation(150,200);
		setSize(240,360);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JButtonTest();

	}

}
