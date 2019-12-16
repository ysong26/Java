package p146;

import java.util.ArrayList;
import java.util.List;

public class StreamEx1 { //람다식

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("홍길동", 100));
		students.add(new Student("박문수", 80));
		students.add(new Student("이순신", 95));
		
		students.stream()
		.filter(s->s.getScore() >= 90)//익명 함수  (->는 지시자 s의 내용은 ->이거라는뜻 
												//if처럼 filter안에 들어가야됨)
		.forEach(s->System.out.println(s.getName()));
	}

}
