package sf;

public class Hero {
	String name; 
	int hp;		//초기 에너지 값
	int now_hp; //현재 에너지 값
	
	//name,hp 초기화 생성자
	Hero(String name, int hp){
	this.name=name; //구분을 위해서 this name=aaa;도 되긴됨
	this.hp=hp;
	now_hp=hp; //now_hp는 하나뿐이라 구분x
}
	//punch 메소드
void punch(Hero a) {
	System.out.println(name + "의 펀치");
	a.now_hp -=10;
	System.out.println("      " +a.name + ":" + a.now_hp + "/" + a.hp);
	
}


}

