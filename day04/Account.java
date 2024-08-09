package day04;

public class Account {

	// balance 필드 은닉화 하기
	private int balance; 
	
	// 상수 필드 정의하기
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	// getter, setter 메소드 정의
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
	
}
