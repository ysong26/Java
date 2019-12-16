package p162;

import java.util.ArrayList;
import java.util.List;

public class limit { //엔트리 클래스

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>(); //list는 순서o 수집을 목적 수집 목적이 아니면 map
		studentList.add(new Student("Park",100));
		studentList.add(new Student("Lee",80));
		studentList.add(new Student("Hwang",100));
		
		System.out.println(studentList);
	
		studentList.stream()
		.limit(2) //2건
		.forEach(s -> System.out.println(s.getName())); //s는 이유x 로컬변수라 아무거나 넣어도됨
		
		studentList.stream()
		.limit(1) //1건
		.forEach(s -> System.out.println(s.getScore()));
	}
	
}
