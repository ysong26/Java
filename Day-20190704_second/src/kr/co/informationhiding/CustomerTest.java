package kr.co.informationhiding;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer("�浿","ȫ");//�����
		cus.setAge(30);
		cus.Address="��⵵ ������ �Ǽ���";//�����
		cus.Description="����";//�����
		
		String CusFirstName=cus.getFirstName();
		String CusLastName=cus.getLastName();
		int CusAge=cus.getAge();
		String CusAddress=cus.getAddress();
		String CusDescription=cus.getDescription();
		
		System.out.println("CusLastName: "+CusLastName);
		System.out.println("CusFirstName: "+CusFirstName);
		System.out.println("CusAge: "+CusAge);
		System.out.println("CusAddress: "+CusAddress);
		System.out.println("CusDescription: "+CusDescription);
	}

}
