package aaa;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CTreeSetTest {

	public static void main(String[] args) {
		
		System.out.println("-정수형인경우-");

		Set<Integer> set = new TreeSet<Integer>();

		set.add(88); // add=요소추가
		set.add(43);
		set.add(1);
		set.add(5);
		set.add(5);
		set.add(3);

		Iterator<Integer> it = set.iterator(); // 반복처리를 실시하기 위한 반복자를 취득

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-문자열인경우-");

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