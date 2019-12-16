package test2;

public class Test28_main {

	public static void main(String[] args) {
		Test28 aaa = new Test28();
		double area = aaa.getArea();
		double hypotenuse = aaa.getHypotenuse();
	
		System.out.printf("삼각형의 넓이 : %.2f\n", aaa.getArea());
		System.out.printf("빗변길이 : %.2f\n", aaa.getHypotenuse());
		System.out.printf("둘레길이 : %.2f\n", aaa.getPerimeter());
	}
}
