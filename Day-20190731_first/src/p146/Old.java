/*
 * 기존 코딩 방식
 */
package p146;

import java.util.Arrays;
import java.util.List;

public class Old {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;
		
		for(String name : names) {
			if(name.contains("a")){ //contains는 a가 포함된걸 찾음 if(name.contains("a")); 하면
									//contains가 종료되서 카운트가 안되서 4개가 됨
				count++; //a가 있을때마다 카운트 증가				
			}
		}
		System.out.println("Count:" +count);
	}
}