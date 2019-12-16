package p410;

public class FindBugsTest {

	public void printOnOffByString(String text) {
		if(text=="on") {
			System.out.println("on");
		}else {
			System.out.println("off");
		}
	}
}
