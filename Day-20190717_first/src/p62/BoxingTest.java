package p62;

public class BoxingTest {

	public static void main(String[] args) {
		//UnBoxing
		
		int num=10;
		
		//Integer num02=Integer.valueOf(10);
		Integer numInt=10; //X 오토박싱
		
		
		//Integer sum=num + numInt.intValue(); //O
		Integer sum=num + numInt; //X 언박싱 -> 연산 -> 오토박싱
	
	}

}
