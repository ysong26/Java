package p77;

public class BaseServiceTest {

	public static void main(String[] args) {
		Object obj=new FooService("hello");
		
		System.out.println(obj instanceof FooService);
		System.out.println(obj instanceof AbstractBaseService);
		System.out.println(obj instanceof BaseService);
		System.out.println(obj instanceof Object);
		
		System.out.println(obj instanceof Integer);

		if(obj instanceof FooService) {
			FooService service = (FooService) obj;
			System.out.println(service.say());
		}
	}

}
