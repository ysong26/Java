
public class p20_1 {

	public static void main(String[] args) {
		int numberA = 10;
		int numberB = 20;
		int numberC = numberA+numberB; //numberA+numberB값을 더해 numberC에 대입
		int numberD = numberA-numberB;
		int numberE = numberA*numberB;
		int numberF = numberA/numberB;
		int numberG = numberA%numberB;
		
		System.out.println("A와 B의 더한값은 : "+numberC); //더하기
		System.out.println("A와 B의 뺀값은 : "+numberD); //빼기
		System.out.println("A와 B의 곱한값은 : "+numberE); //곱하기
		System.out.println("A와 B의 나눈값은 : "+numberF); //나누기
		System.out.println("A와 B의 몫은 : "+numberG); //몫
	}
	
}
