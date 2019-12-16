package p93;

public class StringStackTest {

	public static void main(String[] args) {
		StringStack strStack=new StringStack();
		
		String strElement=strStack.pop();
		strStack.push("홍길동");
		strStack.push("박문수");
		strStack.push("이순신");
		
		strElement=strStack.pop();
		
		if(strElement !=null) { //strElement가 null이 아니면 =값이 들어있으면
			System.out.println(strElement); //마지막에 들어간 값이 나옴(FILO)
		}
	}

}
