package kr.co.iotmit;

public class TestMain {

	public static void main(String[] args) {
		MoneyService service = new MoneyService();
		int input=service.DefaultScreen();
		switch(input) {
			case 4:int row=service.DeleteScreen(); 
			       service.DeleteRow(row);
				   break;
			default:
				service.DefaultScreen();
				break;
		}
	
	}

}
