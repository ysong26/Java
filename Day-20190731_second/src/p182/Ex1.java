package p182;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex1 {

	private static Path path;

	public static void main(String[] args) {
		byte[] contents = new byte[100];
		InputStream is = null;
		
		try {
			is=Files.newInputStream(path);
			is.read(contents);
			is.close(); // close는 try에 넣으면 안좋음 finally에다가 넣어줘야됨
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
