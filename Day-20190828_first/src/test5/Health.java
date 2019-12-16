package test5;

import java.util.Scanner;

class Health {
	String gender;
	double tall;
	double weight;
	
	void input(){
		System.out.println("***** 비만도 Check *****");
		Scanner scan = new Scanner(System.in);

		System.out.println("성별(M/F): ");
		gender = scan.next();
		
		System.out.println("신장(cm): ");
		tall = scan.nextDouble();
		
		System.out.println("체중(kg): ");
		weight = scan.nextDouble();
	}
	
	void output1(){
		System.out.println("성별 - " + gender);
		System.out.println("신장 - " + tall);
		System.out.println("체중 - " + weight);
	}

}


