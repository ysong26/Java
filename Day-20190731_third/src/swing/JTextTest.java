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
		super("�α��� â");
		
		setLayout( new FlowLayout() );
        EtchedBorder eborder =  new EtchedBorder();
        JLabel lbl = new JLabel( "���̵�� �н����带 �Է��� �ּ���." );
        lbl.setBorder(eborder);
        add( lbl );
        
        idPanel = new JPanel();
        paPanel = new JPanel();
        la3 = new JLabel("���̵�");
        la2 = new JLabel("�н�����");
        id = new JTextField(10);
        passwd = new JPasswordField(10);
        idPanel.add(la3);
        idPanel.add(id);
        paPanel.add( la2 );
        paPanel.add( passwd );
        loginPanel = new JPanel();
        b1 = new JButton("�α���");
        b2 = new JButton("ȸ������");
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
