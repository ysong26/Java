package p148; //람다식

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("홍길동", 100));
		students.add(new Student("박문수", 80));
		students.add(new Student("이순신", 95));
		
		System.out.println(students);
		
		Collections.sort(students, (student1, student2)-> 
		Integer.compare(student1.getScore(),student2.getScore()));
		
		System.out.println(students);
	}

}
