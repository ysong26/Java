package test6;

import java.util.Scanner;

class circle {
	int r; //������
	double size; //����
	final double PI=3.141592; //������
	
	circle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		r = scan.nextInt(); //������ �Է¹ޱ�
		process();
		
		scan.close(); //Scanner �ݾ��ֱ�
	}
	
	void process(){ 
		size=r*r*PI; //���� ���� ���
	}
	
	void output(){
		System.out.printf("���� ���̴� %.2f",size); //�Ҽ��� 2�ڸ����� ��� ���
	}
}
