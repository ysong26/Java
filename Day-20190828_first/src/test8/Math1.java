package test8;

import java.util.Scanner;

public class Math1 { //Ŭ�����̸�
	int n,m; //�ʵ��
	
	Math1(int n, int m) {
		this.n=n;
		this.m=m;
	}
	
	void Cal1(int Way,int x) {
		int result=0;
	    switch(Way) {
	    case 1: // ���ϱ�
		    for(int i=n; i<=m; i++) {
				result+=i;
		    }
		    System.out.println("1."+ n +"����"+ m +"���̰��� ����:"+ result);
	    	break;
	    	
	    case 2: //¦�����ϱ�
	    	 for (int i=n; i<=m; i++) {
		    	 if((i%2)==0){ //���࿡ i�� ���� 2�� ������ �� ���� 0���� �������ٸ�
		    		 result++;
		    	 }
	    	 }
		    System.out.println("2."+ n +"����"+ m +"������ ¦�� ������:" + result);
	    	break;
	    	
	    case 3: //Ȧ�����ϱ�
	    	for (int i=n; i<=m; i++) {
		    	 if((i%2)==1){ //���࿡ i�� ���� 2�� ������ �� ���� 0���� �������ٸ�
		    		 result++;
		    	 }
	    	 }
		    System.out.println("3."+ n +"����"+ m +"������ Ȧ�� ������:" + result);
	    	break;
	    	
	    case 4: //�Ҽ��� ���� ���ϱ�
	    	int a,b;
	    	for(a=n; a<=m; a++) {
	    		for(b=2; b<a; b++) {
	    			if((a%b)==0)
	    				break;
	    		}
	    		if(b==a)
	    			result++;
	    	}
	    	System.out.println("4."+ n +"����"+ m +"������ �Ҽ� ������ :"+ result);
	    	break;
	    	
	    case 5: //x�� ��� ���� ���ϱ�
	    	for(int i=n; i<m; i++) {
	    		if((i%x)==0) 
	    			result++;
	    	}
	    	 System.out.println("5."+ n +"����"+ m +"������" + x + "��� ������:"+ result);
	    	break;	
	    }
	    
	    }
}
