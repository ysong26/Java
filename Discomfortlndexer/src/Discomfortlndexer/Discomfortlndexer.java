package Discomfortlndexer;

import java.io.*;

public class Discomfortlndexer 
{
public static void main(String[] args) {

int[] dry= {28,31,35,24,31,32,35}; // �Ǳ��µ�(��)
int[] wet= {16,20,23,16,20,19,22}; // �����µ�(��)

double discomfort=0.0; // ��������

	for (int i=0; i<dry.length; i++) 
	{
	discomfort= (dry[i]+wet[i])*0.72+40.6;
	System.out.println((i+1)+"���� ����������"+ discomfort +"�Դϴ�.");
	
	if ( discomfort >= 80) {
		System.out.println((i+1)+"���� ���������� "+discomfort +
				"�̰� ��� ����� ���谨�� ������ �����Դϴ�\n");
	}else if ( discomfort >= 75 ) {
		System.out.println((i+1)+"���� ���������� "+discomfort +
				"�̰� ���� �̻��� ����� ���谨�� ������ �����Դϴ�\n");
	}else if ( discomfort >= 70 ) {
		System.out.println((i+1)+"���� ���������� "+discomfort +
				"�̰� �Ҽ��� ����� ����� ���谨�� ������ �����Դϴ�\n");
	}else {
		System.out.println((i+1)+"���� ���������� "+discomfort +
			"�̰� ��� ����� ����� ��û�ϰ� ������ �����Դϴ�\n");
			}
		}	
	}
}