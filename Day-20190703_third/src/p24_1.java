
public class p24_1 {

	public static void main(String[] args) {
		int number=0x12345678;
		int lower=number&0x0000ffff;
		
		System.out.printf("lower=%x\n",lower);

	}

}
