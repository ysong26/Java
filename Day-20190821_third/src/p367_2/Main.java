package p367_2;

public class Main {
	
	private static final int User_NUM=5;
	
	public static void main(String[] args) {
		UserThread[] user=new UserThread[User_NUM];
		for(int i=0; i<User_NUM; i++) {
			user[i]=new UserThread((i+1)+"-user");
			user[i].print();
		}

	}

}
