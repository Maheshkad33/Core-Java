package oop02;

public class Person {
	
	//default value int-0;double-0.0,object-null
	
	//instance variables
	private String firstName;
	private String lastName;
	private String city;
	
	public void getData(String firstName,String lastName,String city) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
	}
	
	public void show() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println("City:" + city);
	}

	
}
