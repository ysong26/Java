package aaa;

import java.util.Deque;
import java.util.LinkedList;

public class EDequetest {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
		deque.offerFirst(1); //앞에 값 추가
		deque.offerFirst(3);
		deque.offerLast(4); //뒤에 값 추가
		System.out.println(deque.pollFirst()); //앞에 값 취득&삭제
		deque.offerLast(5);
		System.out.println(deque.pollLast()); //뒤에 값 취득&삭제
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
	}

}
