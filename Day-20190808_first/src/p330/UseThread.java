package p330;

public class UseThread {

	public static void main(String[] args) {
		UseThread test=new UseThread();
		Thread t1=new AddThread("ȫ�浿",20);
		Thread t2=new AddThread("�ڹ���",20);

		t1.start();
		t2.start();
		
	}

}
