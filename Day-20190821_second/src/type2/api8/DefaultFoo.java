package type2.api8;

public class DefaultFoo implements Foo {
	
	private String message;
	
	public DefaultFoo(String message) {
		this.message=message;
	}

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
