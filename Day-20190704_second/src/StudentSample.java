//
//작성일 : 2019-07-04
//작성자 : 서예송
//요  약 : 객체의 정의 및 만드는 방법




public class StudentSample {

	public static void main(String[] args) {
		// Student shion; 쓰레기 
		Student shion=new Student();
		shion.name="홍길동";
		shion.score=80;
		shion.printScore();
	}
}
