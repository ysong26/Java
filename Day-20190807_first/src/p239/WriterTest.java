package p239;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class WriterTest {

	public static void main(String[] args) {
		File file=new File("C:/DEV/sample1.txt");
		BufferedWriter writer=null;
		
		try {
			writer=new BufferedWriter(new OutputStreamWriter( //��ü�̸� ���� = �͸��ν��Ͻ���ü
					new FileOutputStream(file),"UTF-8"
					));
			
			writer.append("test1");
			writer.newLine();
			writer.append("test2");
			
			System.out.println("���� �Է��� �Ϸ��߽��ϴ�.");
		}catch(UnsupportedEncodingException ex) {
			System.err.println(ex);
		}catch(IOException ex) {
			System.err.println(ex);
		}finally {
			if(writer != null) {
				try {
					writer.close();
				}catch(IOException ex) {
					System.err.println(ex);
				}
			}
		}

	}

}
