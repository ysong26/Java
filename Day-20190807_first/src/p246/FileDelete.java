package p246;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File file=new File("C:/DEV/sample1.txt");
		boolean flag=file.delete();
		
		System.out.println(flag); //true∏È ªË¡¶

	}

}
