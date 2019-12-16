package test4;

public class Count {
	static int count =0; //필드명 count:int (초기값0)
						 //static 붙이면 메모리상 한곳에만 count존재해서
						 //count1 count2  둘이 값 공유하게됨
						//final(값변경X) static(하나만존재) 상수(=대문자로 써야됨)
	void add() {
		count++; //add():void -count 값 1증가
	}
	
	void sub() {
		count--; //sub():void -count 값 1감소
	}

}
