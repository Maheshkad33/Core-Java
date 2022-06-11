package oop04;
public class Saving extends Account{
	private double roi;
	
	public Saving(int number, String holder, double balance, double roi) {
		super(number, holder, balance);
		this.roi = roi;
	}
	@Override
	public void showAccount() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Name: " + getAccountHolder());
		System.out.println("Account Balance: " + getAccountBalance());
		System.out.println("ROI: "+roi);
	}
}
