package test2;

public class Test2_2 {

	public static void main(String[] args) {
		//65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
		int money=65430;
		int a,b,c,d;
		
		a=money/10000; //������ ����
		money = money -(a*10000); //money:5430
		b=money/1000; //õ���� ����
		money = money -(b*1000); //money:430
		c=money/100; //����� ����
		money = money -(c*100); //money:30
		d=money/10;	//�ʿ��� ����
		System.out.println("����: "+a+ " õ��: "+b+ " ���: "+c+ " �ʿ�: "+d );
		
/*		 System.out.println("money��" + money);
		 System.out.println("����" + (money/10000) + "��");
		 System.out.println("��õ��" + (money%10000)/5000 + "��");
		 System.out.println("õ��" + (money%10000%5000)/1000 + "��");
		 System.out.println("�����" + (money%10000%5000%1000)/500 + "��");
		 System.out.println("���" + (money%10000%5000%1000%500)/100 + "��");
		 System.out.println("�ʿ�" + (money%10000%5000%1000%500%100)/10 + "��");*/
	}

}
