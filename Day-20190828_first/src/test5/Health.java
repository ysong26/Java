package test5;

import java.util.Scanner;

class Health {
	String gender;
	double tall;
	double weight;
	
	void input(){
		System.out.println("***** �񸸵� Check *****");
		Scanner scan = new Scanner(System.in);

		System.out.println("����(M/F): ");
		gender = scan.next();
		
		System.out.println("����(cm): ");
		tall = scan.nextDouble();
		
		System.out.println("ü��(kg): ");
		weight = scan.nextDouble();
	}
	
	void output1(){
		System.out.println("���� - " + gender);
		System.out.println("���� - " + tall);
		System.out.println("ü�� - " + weight);
	}

}


