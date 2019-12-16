package test3;

public class Test3_main {

	public static void main(String[] args) {
		//아래와 같이 사용되는 CAL이라는 클래스를 만들고 테스트 하시오.
		//ex> cal.add(3,7)
		//	  cal.sub(3,7)
		// CAL cal = new CAL();
		
		CAL cal = new CAL(); //클래스이름 객체명=
		System.out.println(cal.add(3, 7));
		System.out.println(cal.sub(10, 3));
	}

}
