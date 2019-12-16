package p367_3;

public class Main {
	
	private static final int Thread_Num=5;
	
	public static void main(String[] args) {
		UserThread[] user=new UserThread[Thread_Num];
		for(int i=0; i<Thread_Num; i++) {
			user[i]=new UserThread((i+1)+"-thread");
			user[i].start();
		}

	}

}
