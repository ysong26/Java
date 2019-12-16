package p165;

import java.util.Arrays;

public class mapreduce { //맵 리듀스 프로그래밍 가공->처리

	public static void main(String[] args) {
		String[] list = {"1","2","3"};
		int sum=Arrays.stream(list)
				.map(item->Integer.parseInt(item)) //로우 데이터(원래데이터)를 맵 가공
				.reduce(0, (a,b)-> a+b); //맵 안에 있는 데이터를 처리

		System.out.println(sum);
	}
	
}
