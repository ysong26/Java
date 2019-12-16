package p182;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex2 {
	static InputStream is = null;
	
	private static Path path;

	public static void main(String[] args) {
		byte[] contents = new byte[100];
		
		
		try {
			is=Files.newInputStream(path);
			is.read(contents);
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {}
			}
		}
	}
}
