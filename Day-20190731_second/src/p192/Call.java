package p192;

public class Call {
/*	public void caller() {
	try {
		callee();
	} catch(Exception ex) {
		ex.printStackTrace();
	}
}
*/
	public void callee() throws Exception {
		String str="";
		
		System.out.println("str.length = " + str.length());		
	}
}
//함수를 만드는곳에서 트라이캐치x