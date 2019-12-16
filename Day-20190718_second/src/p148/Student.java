package p148;

public class Student {
	
	//학생이름
	public String name; 	
	//학생성적
	public int score;	

	Student(){ //중복정의 오버로드 (개수 2의n승)
		
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
