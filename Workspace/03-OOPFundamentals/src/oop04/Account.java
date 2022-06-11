package oop04;
abstract public class Account extends Object {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance) {
		accountNumber = number;
		accountHolder = holder;
		accountBalance = balance;
	}
	
	public abstract void showAccount();

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	
	
}
