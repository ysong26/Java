package p154;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array {

	public static void main(String[] args) {
		String[] array = {"Park","Lee","Hwang","Kim"};
		Stream<String> stream = Arrays.stream(array); //Array ó���Ҷ� ����ȯ
		stream.forEach(System.out::println);
	}

}
