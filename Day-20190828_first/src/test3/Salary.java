package test3;

class Salary {
	String name;
	int salary;
	
	Salary() {
		super();
	}
	
	Salary(String n, int s){
		super();
		name=n;
		salary=s;
	}
	
	public void getInformation1(){
		System.out.println("�̸�: " + name);
		System.out.println("����: " + salary);
	}
}
