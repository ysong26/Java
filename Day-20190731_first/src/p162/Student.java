package p162;

public class Student { //데이터를 저장할수있는 필드변수들을 가지고있는 클래스를 beans 클래스 중에서도 
						//value obeject class or 모델클래스
						//파이널이 붙어있으면 dto class
	//학생이름
	public String name; //필드변수(데이터를 저장하기위해서)
	//학생성적
	public int score; //필드변수(데이터를 저장하기위해서)

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
