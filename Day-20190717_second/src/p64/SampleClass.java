package p64;

public class SampleClass {
	
	private String name=null;

	private String action() {
		
		//5.�������� �߰�
		name="SampleClass����";
		
		String responseStr=name+">"+"�Դϴ�.";
		
		return responseStr;
	}
	
	//1.Ŭ������ ������ �� �ֵ��� ��Ʈ�� �Լ��� �����.
	public static void main(String[] args) {
		
		//2.��ü ������ �ν��Ͻ��Ѵ�.
		SampleClass sample=new SampleClass();
		
		//3.�Լ��� ȣ���Ͽ� ��ȯ���� �����Ѵ�.
		String response=sample.action();
		
		//4.����� ��ȯ���� ����Ʈ�Ѵ�.
		System.out.println(response);
		}
	}