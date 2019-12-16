package p148; //람다식x 원래하는방식

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("홍길동", 100));
		students.add(new Student("박문수", 80));
		students.add(new Student("이순신", 95));

		System.out.println(students);
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return  Integer.compare(o1.getScore(), o2.getScore());
			}
	
		});
		System.out.println(students);
	}

}
