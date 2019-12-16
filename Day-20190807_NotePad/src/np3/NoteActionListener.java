package np3;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//
//  @ Project : NotePad
//  @ File Name : NoteActionListener.java
//  @ Date : 2019-08-07
//  @ Author : 
//




public class NoteActionListener implements ActionListener {
	private NotePad3 frm;
	private String cmd;
	private FileDialog fd=null;

	
	
	
	public NoteActionListener(NotePad3 frm, FileDialog fd) {
		this.frm=frm;
		this.fd=fd;
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		cmd=ae.getActionCommand();
		String filename=null;
		if(cmd.equals("열기")) {
			fd.setTitle("읽을 파일을 선택하세요.");
			fd.setVisible(true);
			filename=fd.getDirectory()+fd.getFile();
			frm.setTitle(filename);
			frm.loadFile(filename);
		}else if(cmd.equals("저장")){
			fd.setTitle("저장할 파일을 선택하세요.");
		      fd.setVisible(true);
		      filename = fd.getDirectory()+fd.getFile();
		      
		      frm.saveFile(filename);
		}else if(cmd.equals("종료")) {
			frm.dispose();
			System.exit(0);
		}else {
			frm.newFile();
		}
	}
}
