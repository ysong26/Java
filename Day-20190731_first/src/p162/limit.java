package p162;

import java.util.ArrayList;
import java.util.List;

public class limit { //��Ʈ�� Ŭ����

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>(); //list�� ����o ������ ���� ���� ������ �ƴϸ� map
		studentList.add(new Student("Park",100));
		studentList.add(new Student("Lee",80));
		studentList.add(new Student("Hwang",100));
		
		System.out.println(studentList);
	
		studentList.stream()
		.limit(2) //2��
		.forEach(s -> System.out.println(s.getName())); //s�� ����x ���ú����� �ƹ��ų� �־��
		
		studentList.stream()
		.limit(1) //1��
		.forEach(s -> System.out.println(s.getScore()));
	}
	
}
