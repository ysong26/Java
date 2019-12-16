package test2;

public class Ex37 {

	public static void main(String[] args) {
		SubEntry aaa = new SubEntry("OOP","Object Oriented Programming", 1991);
		aaa.printView();//이게 더 좋음
		
		new SubEntry("OOP", "Object Oriented Programming", 1991).printView();
	}
}