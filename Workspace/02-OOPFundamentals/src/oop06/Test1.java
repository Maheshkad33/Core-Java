package oop06;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount acc1 = new SavingAccount(12345, "Mahesh", 5000.00, 8.5);
		CurrentAccount acc2 = new CurrentAccount(4321, "Sanket", 10000.00, 25000);
		
		acc1.displayInfo();
		acc2.displayInfo();
	}

}
