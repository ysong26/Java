package p66;

public class SampleClassBeans {
	public String name=null;
	
	public String action() {
		
		//5.업무로직 추가
		name="SampleClass예제";
		
		String responseStr=name+">"+"입니다.";
		
		return responseStr;
	}
}
