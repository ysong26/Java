package p93;

public class StringStackTest {

	public static void main(String[] args) {
		StringStack strStack=new StringStack();
		
		String strElement=strStack.pop();
		strStack.push("ȫ�浿");
		strStack.push("�ڹ���");
		strStack.push("�̼���");
		
		strElement=strStack.pop();
		
		if(strElement !=null) { //strElement�� null�� �ƴϸ� =���� ���������
			System.out.println(strElement); //�������� �� ���� ����(FILO)
		}
	}

}
