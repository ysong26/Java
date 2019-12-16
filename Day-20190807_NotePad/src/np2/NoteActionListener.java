package np2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//
//  @ Project : NotePad
//  @ File Name : NoteActionListener.java
//  @ Date : 2019-08-07
//  @ Author : 
//




public class NoteActionListener implements ActionListener {
	private NotePad2 frm;
	private String cmd;
	
	
	public NoteActionListener(NotePad2 frm) {
		this.frm=frm;
	}
	
	public void actionPerformed(ActionEvent ae) {
		cmd=ae.getActionCommand();
		if(cmd.equals("Á¾·á")) {
			frm.dispose();
			System.exit(0);
		}else {
			frm.newFile();
		}
	}
}
