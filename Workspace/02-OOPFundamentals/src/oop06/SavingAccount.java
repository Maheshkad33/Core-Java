package oop06;

public class SavingAccount extends Account {

	private double roi;
	
	public SavingAccount(int accountNumber, String holderName, double balance,double roi) {
		super(accountNumber, holderName, balance);
		this.roi=roi;
	}
	
	public void displayInfo()
	{
		System.out.println("Account Number :" + accountNumber);
		System.out.println("AccountHolder Name :" + holderName);
		System.out.println("Account Balance :" + balance);
		System.out.println("Account Rate of Interest :" + roi);
	}
	
	

}
