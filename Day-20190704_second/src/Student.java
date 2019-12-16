//
//작성일 : 2019-07-04
//작성자 : 서예송
//요  약 : 클래스와 객체의 정의 및 만드는 방법
 




public class Student {
	

	public String name;
	public int score;
	public static final int MAX_SCORE = 100;
	
	public void setScore(int newScore) {
	
	}
	
	public void printScore() {
	System.out.println(name + "씨는" + MAX_SCORE + "점 만점 중," +score + "점 입니다.");;
	}
	
	public int getScore() {
		return score;
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		}
	}
