package test4;

public class Test34 extends Salary {
	String department;
	
	Test34(String name, int Salary, String department){
		super(name, Salary);
		this.department=department;
	}
	
	public void getInformation2(){
		System.out.println("ºÎ¼­: " + department);
	}
}
