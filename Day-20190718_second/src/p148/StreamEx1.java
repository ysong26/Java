package p148; //���ٽ�x �����ϴ¹��

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("ȫ�浿", 100));
		students.add(new Student("�ڹ���", 80));
		students.add(new Student("�̼���", 95));

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
