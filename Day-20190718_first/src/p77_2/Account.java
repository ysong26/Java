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
	
	int withdraw(int amount) throws Exception { //예외처리 사용할때 throws Exception
		if(balance<amount) {
			throw new Exception("잔액이 부족합니다."); //예외처리
		}
		balance -=amount;
		return amount;
	}

	
}
