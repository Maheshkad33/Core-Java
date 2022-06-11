package lab4;

public class Book {
	
	private int isbn;
	private String title;
	private String author;
	private double price;
	
	
	public Book(int isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails() {
		System.out.println("Book isbn: " + isbn);
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: "+ author);
		System.out.println("Book actual Price: "+ price);
		System.out.println("Book with discount Price: " + discountedPrice(15));
	}
	
	public double discountedPrice(float discount) {
		double disprice= price - (price*(discount/100));
		return disprice;
	}
	
	

}
