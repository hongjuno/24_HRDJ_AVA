package day04;


import java.util.ArrayList;


public class Account2 {
	
	private int balance;
	private String ano;
	private String owner;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public Account2(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;	
	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
			
			
		
	}
	

