package test2;

public class Test2_1 {

	public static void main(String[] args) {
		//1���� 1000���� Ȧ���� ���ؼ� ����� ���
		int sum=0;
	    for(int i=1; i<1001; i++) { //1~1000���� ���Ѱ�
	    	if(i%2==1) { //Ȧ���϶���
	    		sum+=i; 
			}
	    }
	    System.out.println(sum);
	}

}
