package test7;

import java.util.Scanner;

public class month {
	
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		
		int[] month= {31,28,31,30,31,30,31,31,30,31,30,31};
		int num;
		
		System.out.println("원하는달: ");
		num = scan.nextInt();
		System.out.printf(num + "월은" + month[num-1] + "일입니다.");
		
		scan.close(); //Scanner 닫아주기
		
	}
}
