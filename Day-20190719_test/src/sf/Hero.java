package sf;

public class Hero {
	String name; 
	int hp;		//�ʱ� ������ ��
	int now_hp; //���� ������ ��
	
	//name,hp �ʱ�ȭ ������
	Hero(String name, int hp){
	this.name=name; //������ ���ؼ� this name=aaa;�� �Ǳ��
	this.hp=hp;
	now_hp=hp; //now_hp�� �ϳ����̶� ����x
}
	//punch �޼ҵ�
void punch(Hero a) {
	System.out.println(name + "�� ��ġ");
	a.now_hp -=10;
	System.out.println("      " +a.name + ":" + a.now_hp + "/" + a.hp);
	
}


}

