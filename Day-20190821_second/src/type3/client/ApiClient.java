package type3.client;

import type3.api.Foo;
import type3.api.FooFactory;

public class ApiClient {

	public static void main(String[] args) {
		Foo foo = FooFactory.newInstance("Hello Foo!");
				
		System.out.println(foo.say());
	}

}
