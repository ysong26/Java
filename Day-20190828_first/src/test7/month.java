package test7;

import java.util.Scanner;

public class month {
	
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		
		int[] month= {31,28,31,30,31,30,31,31,30,31,30,31};
		int num;
		
		System.out.println("���ϴ´�: ");
		num = scan.nextInt();
		System.out.printf(num + "����" + month[num-1] + "���Դϴ�.");
		
		scan.close(); //Scanner �ݾ��ֱ�
		
	}
}
