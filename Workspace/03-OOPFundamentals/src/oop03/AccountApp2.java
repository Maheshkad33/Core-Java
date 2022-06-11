package oop03;

public class AccountApp2 {

	public static void main(String[] args) {
	
		Account acc=null;
		
		double random = Math.random();
		System.out.println(random);
		
		if(random<0.5)
			acc=new Saving (101010,"Mahesh Kad",500000,4.5);
		else
			acc=new Current(202020,"Sanket Patil",25000,50000);

		
//		Saving saving = new Saving (101010,"Mahesh Kad",500000,4.5);
//		Current current = new Current(202020,"Sanket Patil",25000,50000);

		acc.showAccount();
	}

}
