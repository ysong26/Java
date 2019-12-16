package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;



public class JTextTest extends JFrame {

    	JLabel lbl,la1,la2,la3;
    	JTextField id;
    	JPasswordField passwd;
    	JPanel idPanel,paPanel,loginPanel;
    	JButton b1,b2;
    	JTextArea content;

		public JTextTest() {
		super("로그인 창");
		
		setLayout( new FlowLayout() );
        EtchedBorder eborder =  new EtchedBorder();
        JLabel lbl = new JLabel( "아이디와 패스워드를 입력해 주세요." );
        lbl.setBorder(eborder);
        add( lbl );
        
        idPanel = new JPanel();
        paPanel = new JPanel();
        la3 = new JLabel("아이디");
        la2 = new JLabel("패스워드");
        id = new JTextField(10);
        passwd = new JPasswordField(10);
        idPanel.add(la3);
        idPanel.add(id);
        paPanel.add( la2 );
        paPanel.add( passwd );
        loginPanel = new JPanel();
        b1 = new JButton("로그인");
        b2 = new JButton("회원가입");
        loginPanel.add( b1 );
        loginPanel.add( b2 );
        add(idPanel);
        add(paPanel);
        add(loginPanel);
        content = new JTextArea(3,20);
        JScrollPane s= new JScrollPane(content);
        add(s);

		
		setLocation(150,200);
		setSize(240,360);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JTextTest();

	}

}
