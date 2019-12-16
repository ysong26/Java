package p192;

public class CallTest {

	public static void main(String[] args) throws Exception {
		Call call=new Call();
		
		//call.caller();
		try {
			call.callee();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
