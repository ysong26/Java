package type2.client;

import type2.api8.DefaultFoo;
import type2.api8.Foo;

public class ApiClient {

	public static void main(String[] args) {
		Foo foo = Foo.newInstance("Hello Foo!");
				
		System.out.println(foo.say());
	}

}
