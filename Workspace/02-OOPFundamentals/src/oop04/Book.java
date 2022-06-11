package oop04;

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	static double discount;
	
	//static block executes only once and used to
	//initialize static datamember of class only
	static {
		System.out.println("static block");
		discount=10;
	}
	
	public Book() {
		System.out.println("default constructor");
	}
	
	
	public Book( String bookName,String bookAuthor,double bookPrice) {
			System.out.println("Prameterized constructor");
			this.bookAuthor=bookAuthor;
			this.bookName=bookName;
			this.bookPrice=bookPrice;
	}
	
	public void showBookDetails() {
		System.out.println("Book Name : "+bookName);
		System.out.println("Book Author : "+bookAuthor);
		System.out.println("Actual Book Price: "+bookPrice);
		System.out.println("Discounted Book Price: "+ calculateDiscount());
	}
	
	//use class name to static variable instead of this
	public static void setDiscount(double discount) {
		Book.discount=discount;
	}
	
	public double calculateDiscount() {
		double actualPrice=bookPrice - ((discount/100)*bookPrice);
		return actualPrice;
	}

}
