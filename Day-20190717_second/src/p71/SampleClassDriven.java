package p71;

public class SampleClassDriven extends SampleClassBase {
	String str=null;
	public String actiondriven() {
		
		//5.업무로직 추가
		str="클래스 상속 예제";
		
		String responseStr=str+">"+"입니다.";
		
		return responseStr;
	}
}
