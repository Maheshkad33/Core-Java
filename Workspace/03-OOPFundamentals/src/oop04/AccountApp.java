package oop04;

public class AccountApp {

	public static void main(String[] args) {
		//Account acc =  new Account();
		Account acc=null;
		Saving saving = new Saving (101010,"Mahesh Kad",500000,4.5);
		Current current = new Current(202020,"Sanket Patil",25000,50000);
		
		acc = saving;
		
		//it binds account type method at compile time and call method of saving
		//class method at run time
		acc.showAccount();//will call from saving class
		
		acc = current;
		acc.showAccount();//will call from current class
		
		
	}

}
