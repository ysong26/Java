package sf;

public class Test_main {

	public static void main(String[] args) {
		Hero hero1 = new Hero("����",30);
		Hero hero2 = new Hero("�Ḯ",30);
		
		hero1.punch(hero2);
		hero2.punch(hero1);
		hero2.punch(hero1);
	}

}
