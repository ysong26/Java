package p77_2;

public class PayTest1 { 

	
	static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("444-555-666",4700);
			
			System.out.println("카드번호:"+obj.cardNo);
			System.out.println("인출액:"+amount);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Account obj=new CheckingAccount(
				"111-222-333",
				"홍길동",
				10000,
				"444-555-666"
				);
		
		pay((CheckingAccount) obj);
		}
		
}
