package p367;

public class CustomerTest {

	public static void main(String[] args) {
		/*CustomerModel c1=new CustomerModel();
		CustomerModel c2=new CustomerModel();*/
		
		CustomerSingleton c1=CustomerSingleton.getInstance();
		CustomerSingleton c2=CustomerSingleton.getInstance();
		
		if(c1.equals(c2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}

}
