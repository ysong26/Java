package p92;

import java.util.ArrayList;
import java.util.List;

public class CollectionType2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); //<String>���� Ÿ�԰���

		list.add("Java"); //������ ���׸����� ���� Ÿ����String���� �����Ǿ� ���ڷ� �ٲٸ� �ȵ�
		
		String element=list.get(0).toString();//��ڽ�(ĳ��Ʈ) ����ߵ�(String)get�� ��
											 //�ٵ� .��� to string ������ �̰ɷ� ��
		
		System.out.println(element);
 	}

}