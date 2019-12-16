package test6;

import java.util.Scanner;

class circle {
	int r; //반지름
	double size; //넓이
	final double PI=3.141592; //원주율
	
	circle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 입력: ");
		r = scan.nextInt(); //반지름 입력받기
		process();
		
		scan.close(); //Scanner 닫아주기
	}
	
	void process(){ 
		size=r*r*PI; //원의 넓이 계산
	}
	
	void output(){
		System.out.printf("원의 넓이는 %.2f",size); //소수점 2자리까지 결과 출력
	}
}
