package test2;

public class Test28_main {

	public static void main(String[] args) {
		Test28 aaa = new Test28();
		double area = aaa.getArea();
		double hypotenuse = aaa.getHypotenuse();
	
		System.out.printf("�ﰢ���� ���� : %.2f\n", aaa.getArea());
		System.out.printf("�������� : %.2f\n", aaa.getHypotenuse());
		System.out.printf("�ѷ����� : %.2f\n", aaa.getPerimeter());
	}
}
