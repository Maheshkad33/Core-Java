package oop04;
public class Current extends Account{
	private double overdraft;
	
	public Current(int number, String holder, double balance, double overdraft) {
		super(number, holder, balance);
		this.overdraft = overdraft;
	}
	
	@Override
	public void showAccount() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Name: " + getAccountHolder());
		System.out.println("Account Balance: " + getAccountBalance());
		System.out.println("Overdraft: "+overdraft);
	}
}
