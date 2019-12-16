package p323;

public interface Bar {
	String say();
	
	static Bar newInstance(String message) {
		return new DefaultBar(message);
	}
}
