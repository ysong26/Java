package p77;

public class FooService extends AbstractBaseService {
	public FooService(String name) {
		super(name);	
	}

	@Override
	public String say() {
		String str="Hello!";

		return str;
	}

}
