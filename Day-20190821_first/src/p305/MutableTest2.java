package p305;

public class MutableTest2 {

	public static void main(String[] args) {
		someMethod();
	
	}

	public static void someMethod() {
		StringBuilder text = new StringBuilder("This is ");
		System.out.println("�����ϱ� ��:" + text);
		write(text);
		System.out.println("������ ��:" + text);
	}

	public static void write(StringBuilder text) {
		text.append("an apple.");
	}

}
