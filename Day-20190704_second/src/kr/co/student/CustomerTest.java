package kr.co.student;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus=new Customer("길동","홍",30);
		cus.Address="경기도 수원시 권선구";
		cus.Description="설명";
		
		String CusFirstName=cus.FirstName;
		String CusLastName=cus.LastName;
		int CusAge=cus.Age;
		String CusAddress=cus.Address;
		String CusDescription=cus.Description;
		
		System.out.println("CusLastName"+CusLastName);
		System.out.println("CusFirstName"+CusFirstName);
		System.out.println("CusAge"+CusAge);
		System.out.println("CusAddress"+CusAddress);
		System.out.println("CusDescription"+CusDescription);
	}

}
