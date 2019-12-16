package p323;

public class DefaultBar implements Bar {
	private String message;
	
	public DefaultBar(String message) {
		this.message=message;
	}

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
