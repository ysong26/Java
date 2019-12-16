package p154;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListnSet {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Park","Lee","Hwang","Kim");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
	}

}
