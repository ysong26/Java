package p77_2;

public class PayTest2 {

	public static void main(String[] args) throws Exception {
		Account obj1=new CheckingAccount(
				"111-222-333",
				"ȫ�浿",
				10000,
				"444-555-666"
				);
		CheckingAccount obj2=(CheckingAccount)obj1;
		
		
		if(obj2 instanceof CheckingAccount) {
				try {
			int amount=obj2.pay("444-555-666",4700);
			System.out.println("ī���ȣ:"+obj2.cardNo);
			System.out.println("�����:"+amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}else {
		System.out.println("ĳ��Ʈ�� �� ���� Ÿ���Դϴ�.");
	}


	}

}
