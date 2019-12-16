
public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person("홍길동",30,"경기도 수원시 권선구 ");
		p1.Fphone="010-000-0000";
		
		String txtName=p1.Fname;
		int txtAge=p1.Fage;
		String txtAddress=p1.Faddress;
		String txtPhone=p1.Fphone;
		
	  //System.out.println(p1.Fphone);
		System.out.println(txtName);
		System.out.println(txtAge);
		System.out.println(txtAddress);
		System.out.println(txtPhone);
	}
                                                                            
}
