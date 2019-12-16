package test2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //입력받는거
		String str;
		int num;
		System.out.println("글자입력:");
		str=scanner.next();
		System.out.println("숫자입력:");
		num=scanner.nextInt(); //숫자입력
		System.out.println(str + num);
		scanner.close(); //이거하면 노란오류안뜸
	}

}
