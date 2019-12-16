package p385;

public class SampleMain {

	public static void main(String[] args) {
		Observer observer = new Client();
		Subject dataChanger = new DataChanger();
		
		dataChanger.addObserver(observer);
		
		
	}

}
