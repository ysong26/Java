package test5;

public class test38 extends Health {
	
	double s_weight; //ǥ��ü��
	double fat; //�񸸵�
	String result; //�����
	
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
		s_weight=(super.tall - 100) * value; //ǥ��ü�߱��ϱ�
		fat= (super.weight/s_weight) * 100;
		if(fat <= 90)
			result="��ü��";
		else if(fat<=110)
			result="����";
		else if(fat<=120)
			result="��ü��";
		else if(fat<=130)
			result="�浵��";
		else if(fat<=150)
			result="�ߵ���";
		else
			result="����";
	}
	void output2(){
		System.out.println("����� �񸸵���"+ fat + "�̰�," + result + "�Դϴ�.");
	}
}

