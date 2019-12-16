package p169;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapfiltercollect {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("ParkMoonsu","LeeSunShin","Hwang");
		
		List<String> newList=list.stream()
				.filter(p->p.length()>5) //5ÀÚ ÀÌ»ó
				.map(p->"["+p+"]")
				.collect(Collectors.toList());

		newList.forEach(System.out::println);

	}

}
