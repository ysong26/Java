package p178;

public class Ex2 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("값을 입력해 주세요: 인수1 인수2");
			System.exit(0); //return 0 의 뜻
		}else {
			
		System.out.println(args[0]);
		System.out.println(args[1]);
		}
	}
}
