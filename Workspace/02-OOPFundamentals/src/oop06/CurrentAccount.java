package oop06;

public class CurrentAccount extends Account {

	private double overDraft;
	
	public CurrentAccount(int accountNumber, String holderName, double balance,double overDraft) {
		super(accountNumber, holderName, balance);
		this.overDraft=overDraft;
	}

	public void displayInfo()
	{
		System.out.println("Account Number :" + accountNumber);
		System.out.println("AccountHolder Name :" + holderName);
		System.out.println("Account Balance :" + balance);
		System.out.println("Account Overdraft :" + overDraft);
	}
	

}
