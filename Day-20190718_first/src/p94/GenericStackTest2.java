package p94;

public class GenericStackTest2 {



	public static void main(String[] args) {
		
		GenericStack<Integer> genStack2 = new GenericStack<>();
		
		genStack2.push(100);
		genStack2.push(200);
		
		Integer genElement2 = genStack2.pop();
		if(genElement2 !=null) {
			System.out.println(genElement2);
		}
		
	}

}