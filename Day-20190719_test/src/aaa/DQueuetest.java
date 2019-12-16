package aaa;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DQueuetest {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(10);
		queue.offer(1); //값 추가
		queue.offer(3);
		System.out.println(queue.poll()); // 값 삭제
		queue.offer(4);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		queue.offer(6);
		queue.offer(8);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.poll()); // 값을 삭제하지 않음
		System.out.println(queue.poll());
	}

}
