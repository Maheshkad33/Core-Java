package thread3;

public class SingleThreadedBank {

	public static void main(String[] args) {

		Customer customer = new Customer("Mahesh", "Kad");
		Account account = new Account(1000);

		customer.setAccount(account);// setup relationship

		System.out.println("Initial Balance: " + customer.getAccount().getBalance());

		account.deposite(5000);

		// System.out.println("Balance after deposit: " +
		// customer.getAccount().getBalance());

		System.out.println("Balance after deposit: " + account.getBalance());

		account.withdraw(1500);
		account.withdraw(4000);
		account.withdraw(1500);
		account.withdraw(1500);
		account.withdraw(1500);
		
	}

}
