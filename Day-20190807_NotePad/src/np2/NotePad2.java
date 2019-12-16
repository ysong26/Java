package np2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//
//  @ Project : NotePad
//  @ File Name : NotePad2.java
//  @ Date : 2019-08-07
//  @ Author : 
//




public class NotePad2 extends Frame implements WindowListener{
	private NoteActionListener nal=null;
	private TextArea ta=null;
	private MenuBar mb=null;
	private Menu mfile=null;
	private String filename="货颇老";
	
	public NotePad2() {  //积己磊俊 void X!!
		nal=new NoteActionListener(this);
		
		ta=new TextArea();
		add(ta,BorderLayout.CENTER);
		
		mb=new MenuBar();
		mfile=new Menu("颇老");
		itemAdd("货颇老",mfile);
		itemAdd("凯扁",mfile);
		itemAdd("历厘",mfile);
		itemAdd("辆丰",mfile);
		
		
		mb.add(mfile);
		
		setMenuBar(mb);
		
		setTitle(filename);
		
		addWindowListener(this);
	}
	
	public void itemAdd(String title, Menu m) {
		MenuItem mi=new MenuItem(title);
		mi.addActionListener(nal);
		m.add(mi);
	}
	
	public void windowsClosing(WindowEvent we) {
		dispose();
		System.exit(0);
	}
	
	public void newFile() {
	filename="货颇老";
	ta.setText("");
	setTitle(filename);
	
	}
	
	public static void main(String[] args) {
		NotePad2 np=new NotePad2();
		np.setSize(640,480);
		np.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
