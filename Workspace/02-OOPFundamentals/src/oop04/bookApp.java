package oop04;

public class bookApp {
	
	static {
		System.out.println("'Bookapp static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		Book.setDiscount(10);
		Book obj1 = new Book("Java", "Kanitkar", 450);
	
		obj1.showBookDetails();
	}

}
