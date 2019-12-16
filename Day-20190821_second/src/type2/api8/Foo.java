package type2.api8;

public interface Foo {
	String say();
	
	static Foo newInstance(String message) {
		return new DefaultFoo(message);
	}
}
