package test2;

public class Test2_3 {

	public static void main(String[] args) {
		//��Ģ������ �����ϴ� �޼ҵ� �����
		int x=10, y=3;
		System.out.println(add(x,y)); //���Ѱ�
		System.out.println(sub(x,y)); //����
		System.out.println(mul(x,y)); //���Ѱ�
		System.out.println(div(x,y)); //������(��)
		System.out.println(rem(x,y)); //������(������)
	
		Calculator cal1 = new Calculator(10,3); //Ŭ���� Ÿ���̸�  = ������  �����ڴ� ����X
//		cal1.x=10; //private�̶� ���� (����� ��������)
//		cal1.y=3; 
		System.out.println(cal1.add());
		System.out.println(cal1.sub());
		Calculator cal2 = new Calculator(3,7);
//		cal2.x=3;
//		cal2.y=7;
		System.out.println(cal2.add());
	}

	private static int add(int x, int y) {
		
		return x+y;
	}
	private static int sub(int x, int y) {
		
		return x-y;
	}
	private static int mul(int x, int y) {
		
		return x*y;
	}
	private static double div(int x, int y) {
		
		return ((double)x)/y;
	}
	private static int rem(int x, int y) {
		
		return x%y;
	}
}
