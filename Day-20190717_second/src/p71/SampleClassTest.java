package p71;

public class SampleClassTest {

	
	//1.Ŭ������ ������ �� �ֵ��� ��Ʈ�� �Լ��� �����.
	public static void main(String[] args) {
		
		//2.��ü ������ �ν��Ͻ��Ѵ�.
		SampleClassDriven sample=new SampleClassDriven();
		
		//3.�Լ��� ȣ���Ͽ� ��ȯ���� �����Ѵ�.
		String response1=sample.action();
		String response2=sample.actiondriven();
		//4.����� ��ȯ���� ����Ʈ�Ѵ�.
		System.out.println(response1+":"+response2);
		}
	
	
	}