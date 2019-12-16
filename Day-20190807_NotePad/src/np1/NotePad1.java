package np1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//
//  @ Project : NotePad
//  @ File Name : NotePad1.java
//  @ Date : 2019-08-07
//  @ Author : 서예송
//




public class NotePad1 {
	private File file=null;
	private FileInputStream fis=null;
	private BufferedInputStream bis=null;
	
	public NotePad1(String filename) {
		file=new File(filename);
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			
			byte[] buf=new byte[64];
			int len=0;
			
			while((len=bis.read(buf,0,buf.length))!=-1) { //메모리는 0부터시작해서 -1로 함 -> 0이상일때만 print
				String str=new String(buf,0,len, "EUC-KR");
				System.out.println(str);
			}
			
			
		}catch(IOException ioe) {
			System.out.println("아래와 같은 이유로 파일로부터 내용을 읽을 수 없습니다.");
			ioe.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		NotePad1 np=new NotePad1(args[0]);
	}
}













