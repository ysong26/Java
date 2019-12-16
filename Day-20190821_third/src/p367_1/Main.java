package p367_1;

public class Main {
	
	private static final int Thread_Num=5;
	
	public static void main(String[] args) {
		User[] user=new User[Thread_Num];
		for(int i=0; i<Thread_Num; i++) {
			user[i]=new User((i+1)+"-thread");
			user[i].start();
		}

	}

}
