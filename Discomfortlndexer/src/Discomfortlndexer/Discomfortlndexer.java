package Discomfortlndexer;

import java.io.*;

public class Discomfortlndexer 
{
public static void main(String[] args) {

int[] dry= {28,31,35,24,31,32,35}; // 건구온도(℉)
int[] wet= {16,20,23,16,20,19,22}; // 습구온도(℉)

double discomfort=0.0; // 불쾌지수

	for (int i=0; i<dry.length; i++) 
	{
	discomfort= (dry[i]+wet[i])*0.72+40.6;
	System.out.println((i+1)+"일의 불쾌지수는"+ discomfort +"입니다.");
	
	if ( discomfort >= 80) {
		System.out.println((i+1)+"일의 불쾌지수는 "+discomfort +
				"이고 모든 사람이 불쾌감을 느끼는 날씨입니다\n");
	}else if ( discomfort >= 75 ) {
		System.out.println((i+1)+"일의 불쾌지수는 "+discomfort +
				"이고 절반 이상의 사람이 불쾌감을 느끼는 날씨입니다\n");
	}else if ( discomfort >= 70 ) {
		System.out.println((i+1)+"일의 불쾌지수는 "+discomfort +
				"이고 소수의 사람이 사람이 불쾌감을 느끼는 날씨입니다\n");
	}else {
		System.out.println((i+1)+"일의 불쾌지수는 "+discomfort +
			"이고 모든 사람이 사람이 쾌청하게 느끼는 날씨입니다\n");
			}
		}	
	}
}