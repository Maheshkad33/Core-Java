package oop03;

public class bookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book.setDiscount(10);
		Book obj1 = new Book();
		obj1.getBookDetails("Java", "Kanitkar", 450);
		obj1.showBookDetails();
	}

}
