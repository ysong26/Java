package p165;

import java.util.Arrays;

public class mapreduce { //�� ���ེ ���α׷��� ����->ó��

	public static void main(String[] args) {
		String[] list = {"1","2","3"};
		int sum=Arrays.stream(list)
				.map(item->Integer.parseInt(item)) //�ο� ������(����������)�� �� ����
				.reduce(0, (a,b)-> a+b); //�� �ȿ� �ִ� �����͸� ó��

		System.out.println(sum);
	}
	
}
