package p367_2;

public class Printer {
	
	private static Printer printer=null;
	
	public static Printer getPrinter() {
		if(printer==null) {
			printer=new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
		
	}

}
