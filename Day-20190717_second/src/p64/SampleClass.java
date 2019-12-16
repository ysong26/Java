package p64;

public class SampleClass {
	
	private String name=null;

	private String action() {
		
		//5.업무로직 추가
		name="SampleClass예제";
		
		String responseStr=name+">"+"입니다.";
		
		return responseStr;
	}
	
	//1.클래스를 실행할 수 있도록 엔트리 함수를 만든다.
	public static void main(String[] args) {
		
		//2.객체 변수를 인스턴스한다.
		SampleClass sample=new SampleClass();
		
		//3.함수를 호출하여 반환값을 저장한다.
		String response=sample.action();
		
		//4.저장된 반환값을 프린트한다.
		System.out.println(response);
		}
	}