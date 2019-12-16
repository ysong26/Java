package p178;

public class Ex3 { //예외처리 구문

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}catch(Exception e) {
			System.out.println("두 개의 값을 입력하세요");
		}
		
	}
	
}