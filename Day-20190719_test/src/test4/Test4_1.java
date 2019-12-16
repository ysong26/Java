package test4;

public class Test4_1 {

	public static void main(String[] args) {
		//다음처럼 사용되는 클래스 Count를 만드시오.
		//클래스명 Count
		//필드명 count:int (초기값0)
		//메소드
		//add():void -count 값 1증가
		//sub():void -count 값 1감소
		//테스트 케이스: 두개의 객체를 만들어서 각각 값 증가 및 감소 테스트를 한다.
		Count count1 = new Count();
		Count count2 = new Count();
		
		count2.add();
		System.out.println(count1.count + " " + count2.count);
		count1.add();
		count2.add();
		System.out.println(count1.count + " " + count2.count);
		count1.sub();
		count2.sub();
		System.out.println(count1.count + " " + count2.count);
	}

}
