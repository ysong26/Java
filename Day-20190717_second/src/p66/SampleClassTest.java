package p66;

public class SampleClassTest {

	
	//1.Ŭ������ ������ �� �ֵ��� ��Ʈ�� �Լ��� �����.
	public static void main(String[] args) {
		
		//2.��ü ������ �ν��Ͻ��Ѵ�.
		SampleClassBeans sample=new SampleClassBeans();
		
		//3.�Լ��� ȣ���Ͽ� ��ȯ���� �����Ѵ�.
		String response=sample.action();
		
		//4.����� ��ȯ���� ����Ʈ�Ѵ�.
		System.out.println(response);
		}
	}