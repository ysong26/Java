package aaa;

import java.util.Deque;
import java.util.LinkedList;

public class EDequetest {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.offerFirst(1); //�տ� �� �߰�
		deque.offerFirst(3);
		deque.offerLast(4); //�ڿ� �� �߰�
		System.out.println(deque.pollFirst()); //�տ� �� ���&����
		deque.offerLast(5);
		System.out.println(deque.pollLast()); //�ڿ� �� ���&����
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
	}

}
