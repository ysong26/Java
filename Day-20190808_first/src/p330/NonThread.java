package p330;

public class NonThread {
	private void add(String username, int target) {
		
		for(int i=0; i<100; i++) {
			try {
				System.out.println(username+"�����Ȳ"+target);
				Thread.sleep(100);
				target++;
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(username+"�� ��û�� ���"+target);
		
	}

	public static void main(String[] args) {
		NonThread test=new NonThread();
		test.add("ȫ�浿",20);
		test.add("�ڹ���",20);
		
	}



}
