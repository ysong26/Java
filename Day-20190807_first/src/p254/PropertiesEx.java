package p254;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		File file = new File("mail.properties");
		
		InputStream is=null;
		try {
			is=new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(is);

			String address=properties.getProperty("system.mail.address");
			System.out.println(address);
					
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			if(is != null) {
				try {
					is.close();
				}catch(Exception e) {}
			}
			
		}

	}

}
