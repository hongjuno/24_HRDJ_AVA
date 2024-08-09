package day04;
import java.util.Scanner;
import java.util.ArrayList;


public class BankApplication {

	public static void main(String[] args) {
		
		
		
		
		Account hanaAccount = new Account();
		hanaAccount.setBalance(10000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance() );
		
		hanaAccount.setBalance(-100);
		System.out.println("현재 잔고: " + hanaAccount.getBalance() );
		
		hanaAccount.setBalance(2000000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance() );
		
		hanaAccount.setBalance(300000);
		System.out.println("현재 잔고: " + hanaAccount.getBalance() );
		
	}

}
