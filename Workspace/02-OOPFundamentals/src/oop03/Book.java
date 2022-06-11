package oop03;

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	static double discount;
	
	public void getBookDetails( String bookName,String bookAuthor,double bookPrice) {
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
