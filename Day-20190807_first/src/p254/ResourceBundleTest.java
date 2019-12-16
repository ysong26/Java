package p254;

import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("mail");
		
		String message = bundle.getString("system.mail.errormessage");
		System.out.println(message);

	}

}
