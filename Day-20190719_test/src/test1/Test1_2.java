package test1;

public class Test1_2 {

	public static void main(String[] args) {
		
		int x=3, y=5,sum;
		//add 메소드를 만들자
		sum=add(x,y);
		System.out.println(x + "+" + y + "=" + sum);
	} 

	private static int add(int x, int y) {
		
		return x+y;
	}
}
