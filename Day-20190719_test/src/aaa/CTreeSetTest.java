package aaa;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CTreeSetTest {

	public static void main(String[] args) {
		
		System.out.println("-�������ΰ��-");

		Set<Integer> set = new TreeSet<Integer>();

		set.add(88); // add=����߰�
		set.add(43);
		set.add(1);
		set.add(5);
		set.add(5);
		set.add(3);

		Iterator<Integer> it = set.iterator(); // �ݺ�ó���� �ǽ��ϱ� ���� �ݺ��ڸ� ���

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-���ڿ��ΰ��-");

		Set<String> sts = new TreeSet<String>();
		sts.add("a");
		sts.add("c");
		sts.add("d");
		sts.add("b");
		sts.add("a");

		Iterator<String> its = sts.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
	}
}