package test4;

public class Count {
	static int count =0; //�ʵ�� count:int (�ʱⰪ0)
						 //static ���̸� �޸𸮻� �Ѱ����� count�����ؼ�
						 //count1 count2  ���� �� �����ϰԵ�
						//final(������X) static(�ϳ�������) ���(=�빮�ڷ� ��ߵ�)
	void add() {
		count++; //add():void -count �� 1����
	}
	
	void sub() {
		count--; //sub():void -count �� 1����
	}

}
