package p330;

public class NonThread {
	private void add(String username, int target) {
		
		for(int i=0; i<100; i++) {
			try {
				System.out.println(username+"진행상황"+target);
				Thread.sleep(100);
				target++;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(username+"가 요청한 결과"+target);
		
	}

	public static void main(String[] args) {
		NonThread test=new NonThread();
		test.add("홍길동",20);
		test.add("박문수",20);
		
	}



}
