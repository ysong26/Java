package p148;

public class Student {
	
	//�л��̸�
	public String name; 	
	//�л�����
	public int score;	

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
