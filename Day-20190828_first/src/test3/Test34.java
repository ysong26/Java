package test3;

public class Test34 extends Salary {
	String department;

	Test34(){
		super();
	}
	
	Test34(String name, int salary, String department){
		super(name, salary);
		this.department=department;
	}
	public void getInformation2(){
		System.out.println("�μ�: " + department);
	}
		public static void main(String[] args) {
			Test34 ob = new Test34("��ö����", 85000000, "ö���");
			ob.getInformation1();
			ob.getInformation2();
		}
	}