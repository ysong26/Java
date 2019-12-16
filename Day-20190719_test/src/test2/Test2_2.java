package test2;

public class Test2_2 {

	public static void main(String[] args) {
		//65430원을 만들기 위한 화폐의 개수를 구하시오.
		int money=65430;
		int a,b,c,d;
		
		a=money/10000; //만원의 개수
		money = money -(a*10000); //money:5430
		b=money/1000; //천원의 개수
		money = money -(b*1000); //money:430
		c=money/100; //백원의 개수
		money = money -(c*100); //money:30
		d=money/10;	//십원의 개수
		System.out.println("만원: "+a+ " 천원: "+b+ " 백원: "+c+ " 십원: "+d );
		
/*		 System.out.println("money는" + money);
		 System.out.println("만원" + (money/10000) + "개");
		 System.out.println("오천원" + (money%10000)/5000 + "개");
		 System.out.println("천원" + (money%10000%5000)/1000 + "개");
		 System.out.println("오백원" + (money%10000%5000%1000)/500 + "개");
		 System.out.println("백원" + (money%10000%5000%1000%500)/100 + "개");
		 System.out.println("십원" + (money%10000%5000%1000%500%100)/10 + "개");*/
	}

}
