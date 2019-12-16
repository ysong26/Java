package p71;

public class SampleClassTest {

	
	//1.클래스를 실행할 수 있도록 엔트리 함수를 만든다.
	public static void main(String[] args) {
		
		//2.객체 변수를 인스턴스한다.
		SampleClassDriven sample=new SampleClassDriven();
		
		//3.함수를 호출하여 반환값을 저장한다.
		String response1=sample.action();
		String response2=sample.actiondriven();
		//4.저장된 반환값을 프린트한다.
		System.out.println(response1+":"+response2);
		}
	
	
	}