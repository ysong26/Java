package p94;

public class GenericStackTest {



	public static void main(String[] args) {
		GenericStack<String> genStack=new GenericStack<>(); //<string>»ý·«µÊ 
		GenericStack<Integer> genStack2=new GenericStack<>();
		
		genStack.push("Scala");
		genStack.push("Groovy");
		genStack.push("Java");
		genStack2.push(100);
		
		String genElement = genStack.pop();
		Integer genElement1 = genStack2.pop();
		
		if(genElement !=null) {
			System.out.println(genElement);
		}
		
	}

}