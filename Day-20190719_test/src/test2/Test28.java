package test2;


public class Test28 {

		double base=5.0;
		double height=3.5;

		double getArea() {
			return (base*height)/2;
		}
		double getHypotenuse() {
			return Math.sqrt(base*base+height); //������ ���ϴ� �żҵ�
		}
		double getPerimeter() {
			return base + height + getHypotenuse();
		}
	}