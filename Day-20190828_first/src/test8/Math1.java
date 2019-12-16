package test8;

import java.util.Scanner;

public class Math1 { //클래스이름
	int n,m; //필드명
	
	Math1(int n, int m) {
		this.n=n;
		this.m=m;
	}
	
	void Cal1(int Way,int x) {
		int result=0;
	    switch(Way) {
	    case 1: // 더하기
		    for(int i=n; i<=m; i++) {
				result+=i;
		    }
		    System.out.println("1."+ n +"부터"+ m +"사이값의 합은:"+ result);
	    	break;
	    	
	    case 2: //짝수구하기
	    	 for (int i=n; i<=m; i++) {
		    	 if((i%2)==0){ //만약에 i의 값이 2로 나누어 그 값이 0으로 떨어진다면
		    		 result++;
		    	 }
	    	 }
		    System.out.println("2."+ n +"부터"+ m +"까지의 짝수 개수는:" + result);
	    	break;
	    	
	    case 3: //홀수구하기
	    	for (int i=n; i<=m; i++) {
		    	 if((i%2)==1){ //만약에 i의 값이 2로 나누어 그 값이 0으로 떨어진다면
		    		 result++;
		    	 }
	    	 }
		    System.out.println("3."+ n +"부터"+ m +"까지의 홀수 개수는:" + result);
	    	break;
	    	
	    case 4: //소수의 개수 구하기
	    	int a,b;
	    	for(a=n; a<=m; a++) {
	    		for(b=2; b<a; b++) {
	    			if((a%b)==0)
	    				break;
	    		}
	    		if(b==a)
	    			result++;
	    	}
	    	System.out.println("4."+ n +"부터"+ m +"사이의 소수 개수는 :"+ result);
	    	break;
	    	
	    case 5: //x의 배수 개수 구하기
	    	for(int i=n; i<m; i++) {
	    		if((i%x)==0) 
	    			result++;
	    	}
	    	 System.out.println("5."+ n +"부터"+ m +"사이의" + x + "배수 개수는:"+ result);
	    	break;	
	    }
	    
	    }
}
