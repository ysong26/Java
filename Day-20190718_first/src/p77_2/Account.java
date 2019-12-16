package p77_2;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
	int withdraw(int amount) throws Exception { //����ó�� ����Ҷ� throws Exception
		if(balance<amount) {
			throw new Exception("�ܾ��� �����մϴ�."); //����ó��
		}
		balance -=amount;
		return amount;
	}

	
}
