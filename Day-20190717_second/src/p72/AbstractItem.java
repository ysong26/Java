package p72;

public abstract class AbstractItem {
	protected String name; //전역변수name
	
	public AbstractItem(String name) { //파라미터 name 둘이 다름 
		this.name=name; //매핑하려구 이름 똑같이씀
	}
	
	public abstract void print(String parentPath); //추상함수 있다구 선언만 하고 구현X
	
}
