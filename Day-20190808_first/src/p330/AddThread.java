package p330;

public class AddThread extends Thread {
	
	String username=null;
	int target=0;
	
	public AddThread(String username, int target) {
		this.username=username;
		this.target=target;
	}
	
	public void run() {
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
}
