package p146;

import java.util.ArrayList;
import java.util.List;

public class StreamEx1 { //���ٽ�

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("ȫ�浿", 100));
		students.add(new Student("�ڹ���", 80));
		students.add(new Student("�̼���", 95));
		
		students.stream()
		.filter(s->s.getScore() >= 90)//�͸� �Լ�  (->�� ������ s�� ������ ->�̰Ŷ�¶� 
												//ifó�� filter�ȿ� ���ߵ�)
		.forEach(s->System.out.println(s.getName()));
	}

}
