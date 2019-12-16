package type3.api;

public class FooFactory {
	
	public static Foo newInstance(String message) {
		return new DefaultFoo(message);
	}
}
	
