/*
 * ���� �ڵ� ���
 */
package p146;

import java.util.Arrays;
import java.util.List;

public class New {

	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;
			
		count = names.stream().filter(name->name.contains("a")).count(); //���ĺ� ī��ƮX��
																		//�ƴ϶� ��ū����̶� e�ص� 1����
		
		System.out.println("Count:" +count);
	}

}