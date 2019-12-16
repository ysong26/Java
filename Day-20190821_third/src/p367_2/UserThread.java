package p367_2;

public class UserThread {

	private String name;

	public UserThread(String name) {
		this.name=name;
	}

	public void print() {
		Printer printer=Printer.getPrinter();
		printer.print(this.name + "print using" + printer.toString() + ".");
	}

}
