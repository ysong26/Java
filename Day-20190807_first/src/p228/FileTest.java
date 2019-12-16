package p228;

import java.io.File;
import java.io.IOException;

public class FileTest {
		/*
		 * 1.���� ��ü ����
		 * File file=new File("�����̸�");
		 * File file=new File("���丮�̸�","�����̸�");
		 */
	
		public void Test() throws IOException{
			File file=new File("C:/DEV/sample1.txt"); //���ϰ��
			File dir=new File("C:\\DEV\\DirTest"); //���丮��� 
			
			if(!file.exists()) { //������ �ִ��� ������ �Ǵ� ���������� ó�����ֱ����� !
				System.out.println("������ �������� �ʽ��ϴ�.");
			
				file.createNewFile();
				System.out.println("�� ������ ��������ϴ�.");
		}
	
		//���丮 �����
		dir.mkdir();
		System.out.println("DirTest��� ���丮�� ��������ϴ�.");
		
		File dirlist=new File("."); //.�� ������Ʈ ����
		for(String str : dirlist.list()) {
			System.out.println(str); //230p
		}
		
	}
				
	public static void main(String[] args) {
		FileTest ft=new FileTest();
		
		try {
			ft.Test();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		
	}

}
