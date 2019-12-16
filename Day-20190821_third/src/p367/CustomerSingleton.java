package p367;

public class CustomerSingleton {

	private static CustomerSingleton instance=new CustomerSingleton();
	
	private CustomerSingleton() {
		
	}
	
	public static CustomerSingleton getInstance() {
		return instance;
	}
	
}
