package p72;

public abstract class AbstractItem {
	protected String name; //��������name
	
	public AbstractItem(String name) { //�Ķ���� name ���� �ٸ� 
		this.name=name; //�����Ϸ��� �̸� �Ȱ��̾�
	}
	
	public abstract void print(String parentPath); //�߻��Լ� �ִٱ� ���� �ϰ� ����X
	
}
