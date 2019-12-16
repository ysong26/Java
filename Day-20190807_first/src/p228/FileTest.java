package p228;

import java.io.File;
import java.io.IOException;

public class FileTest {
		/*
		 * 1.파일 객체 생성
		 * File file=new File("파일이름");
		 * File file=new File("디렉토리이름","파일이름");
		 */
	
		public void Test() throws IOException{
			File file=new File("C:/DEV/sample1.txt"); //파일경로
			File dir=new File("C:\\DEV\\DirTest"); //디렉토리경로 
			
			if(!file.exists()) { //파일이 있는지 없는지 판단 없을때먼저 처리해주기위해 !
				System.out.println("파일이 존재하지 않습니다.");
			
				file.createNewFile();
				System.out.println("빈 파일을 만들었습니다.");
		}
	
		//디렉토리 만들기
		dir.mkdir();
		System.out.println("DirTest라는 디렉토리를 만들었습니다.");
		
		File dirlist=new File("."); //.은 프로젝트 폴더
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
