package p92;

import java.util.ArrayList;
import java.util.List;

public class CollectionType1 {

	public static void main(String[] args) {
		List list=new ArrayList();

		list.add("Java");
		
		String element=list.get(0).toString();//��ڽ�(ĳ��Ʈ) ����ߵ�(String)get�� ��
											 //�ٵ� .��� to string ������ �̰ɷ� ��
		
		System.out.println(element);
 	}

}