package p300;

public class CallByValueSample {

	public static void main(String[] args) {
		int value = 1;
		callByValue(value);
		System.out.println("main :"+value);

	}

	public static void callByValue(int value) {
		value++;
		System.out.println("callByValue :"+value);
		
	}

}
