package p162;

public class Student { //�����͸� �����Ҽ��ִ� �ʵ庯������ �������ִ� Ŭ������ beans Ŭ���� �߿����� 
						//value obeject class or ��Ŭ����
						//���̳��� �پ������� dto class
	//�л��̸�
	public String name; //�ʵ庯��(�����͸� �����ϱ����ؼ�)
	//�л�����
	public int score; //�ʵ庯��(�����͸� �����ϱ����ؼ�)

	Student(){ //�ߺ����� �����ε� (���� 2��n��)
		
	}
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
	@Override
	public String toString() {
		return name + ":" + score;
	}
	
	
}
