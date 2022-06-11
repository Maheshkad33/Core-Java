package lab4;

public class Account {

	private double balance=0;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance += amt;
		System.out.println("Amount Desposited");
	}
	
	public void withdraw (double amt) {
		balance -=amt;
		System.out.println("Amount Withdrawn");
	}
	
	
	
	
}
