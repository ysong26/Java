/*
 * 기존 코딩 방식
 */
package p146;

import java.util.Arrays;
import java.util.List;

public class New {

	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;
			
		count = names.stream().filter(name->name.contains("a")).count(); //알파벳 카운트X가
																		//아니라 토큰기반이라 e해도 1개임
		
		System.out.println("Count:" +count);
	}

}