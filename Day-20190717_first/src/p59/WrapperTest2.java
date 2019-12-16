package p59;

public class WrapperTest2 {

	public static void main(String[] args) {
		//int->Integer
		Integer num01=new Integer(10); //X
		Integer num02=Integer.valueOf(10); //O
		
		//Integer->int
		int num03=num02.intValue();
				
		//String->Integer
		Integer num04=new Integer("10"); //X
		Integer num05=Integer.valueOf("10"); //O
		Integer num06=Integer.valueOf("11", 2);
		
		System.out.println(num06);
		
		//String->int
		int num07=Integer.parseInt("10"); //O 가장 많이 사용하는 케이스
		int num08=Integer.parseInt("11",2); //X
		
		//int->String
		String num09=Integer.toString(10); //O
		
		//Integer->String
		Integer num10=Integer.valueOf(10);
		String num11=num10.toString();
		
	}

}
