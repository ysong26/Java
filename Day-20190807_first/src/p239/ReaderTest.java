package p239;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReaderTest {

	public static void main(String[] args) {
		File file=new File("C:/DEV/sample1.txt");
		BufferedReader reader=null;
		
		try {
			reader=new BufferedReader(new InputStreamReader(
					new FileInputStream(file),"UTF-8"
					));
			
			for(String line; (line=reader.readLine()) !=null; ) {
				System.out.println(line);
			}
			
			
		}catch(UnsupportedEncodingException ex) {
			System.err.println(ex);
		}catch(IOException ex) {
			System.err.println(ex);
		}finally {
			if(reader != null) {
				try {
					reader.close();
				}catch(IOException ex) {
					System.err.println(ex);
				}
			}
		}

	}

}
