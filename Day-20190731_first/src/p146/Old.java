/*
 * ���� �ڵ� ���
 */
package p146;

import java.util.Arrays;
import java.util.List;

public class Old {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Park","Lee","Hwang","Kim");
		long count=0;
		
		for(String name : names) {
			if(name.contains("a")){ //contains�� a�� ���ԵȰ� ã�� if(name.contains("a")); �ϸ�
									//contains�� ����Ǽ� ī��Ʈ�� �ȵǼ� 4���� ��
				count++; //a�� ���������� ī��Ʈ ����				
			}
		}
		System.out.println("Count:" +count);
	}
}