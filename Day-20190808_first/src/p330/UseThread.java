package p330;

public class UseThread {

	public static void main(String[] args) {
		UseThread test=new UseThread();
		Thread t1=new AddThread("홍길동",20);
		Thread t2=new AddThread("박문수",20);

		t1.start();
		t2.start();
		
	}

}
