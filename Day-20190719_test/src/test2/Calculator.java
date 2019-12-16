package test2;

public class Calculator {
	private int x,y; //외부에서 사용X
	
	Calculator(int x, int y){
		this.x =x;
		this.y =y;
	}
	
	Calculator(){
	}
	
	Calculator(int a){
		x=a;
		y=10;
	}
	
	int add() {	
		return x+y;
	}
	int sub() {
		return x-y;
	}
	int mul() {
		return x*y;
	}
	double div() {
		return ((double)x)/y;
	}
	int rem() {
		return x%y;
	}
}
