package p62;

public class BoxingTest {

	public static void main(String[] args) {
		//UnBoxing
		
		int num=10;
		
		//Integer num02=Integer.valueOf(10);
		Integer numInt=10; //X ����ڽ�
		
		
		//Integer sum=num + numInt.intValue(); //O
		Integer sum=num + numInt; //X ��ڽ� -> ���� -> ����ڽ�
	
	}

}
