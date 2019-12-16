package np3;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

//
//  @ Project : NotePad
//  @ File Name : NotePad3.java
//  @ Date : 2019-08-07
//  @ Author : 
//




public class NotePad3 extends Frame implements WindowListener{
	private NoteActionListener nal=null;
	private TextArea ta=null;
	private MenuBar mb=null;
	private Menu mfile=null;
	private String filename="새파일";
	
	private FileDialog fd=null;
	
	public NotePad3() {
		fd=new FileDialog(this);
		nal=new NoteActionListener(this,fd);
		
		ta=new TextArea();
		add(ta,BorderLayout.CENTER);
		
		mb=new MenuBar();
		mfile=new Menu("파일");
		itemAdd("새파일",mfile);
		itemAdd("열기",mfile);
		itemAdd("저장",mfile);
		itemAdd("종료",mfile);
		
		
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
	filename="새파일";
	ta.setText("");
	setTitle(filename);
	
	}
	
	public void loadFile(String fn) {
		File file = new File(fn);
	    FileReader fr = null;
	    BufferedReader br = null;
	    
	    try {
	        fr = new FileReader(file);
	        br = new BufferedReader(fr);
	       
	        String str = null;
	       
	        ta.setText("");
	       
	        while((str=br.readLine())!=null) {
	          ta.append(str+"\n");
	        }
	      }catch(IOException ioe) {
	        ioe.printStackTrace();
	      }
	      filename = fn;
	      setTitle(fn);
	    }
	
	public void saveFile(String fn) {
		File file = new File(fn);

	    try {
	      FileOutputStream fos = new FileOutputStream(file);
	      PrintStream ps = new PrintStream(fos);
	      ps.print(ta.getText());
	    }catch(IOException ioe) {
	      ioe.printStackTrace();
	    }

	    filename = fn;
	    setTitle(fn);
	}
	
	public static void main(String[] args) {
		NotePad3 np=new NotePad3();
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
