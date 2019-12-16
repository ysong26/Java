package test5;

public class test38 extends Health {
	
	double s_weight; //표준체중
	double fat; //비만도
	String result; //결과값
	
	test38(){
		s_weight=0.0;
		fat=0.0;
		result=null;
	}
	
	void calculate(){
		double value;
		if (super.gender.equalsIgnoreCase("M"))
			value=0.9;
		else
			value=0.85;
		//double value = (super.gender.equalsIgnoreCase("M")) ? 0.9 : 0.85;
		s_weight=(super.tall - 100) * value; //표준체중구하기
		fat= (super.weight/s_weight) * 100;
		if(fat <= 90)
			result="저체중";
		else if(fat<=110)
			result="정상";
		else if(fat<=120)
			result="과체중";
		else if(fat<=130)
			result="경도비만";
		else if(fat<=150)
			result="중도비만";
		else
			result="고도비만";
	}
	void output2(){
		System.out.println("당신은 비만도는"+ fat + "이고," + result + "입니다.");
	}
}

