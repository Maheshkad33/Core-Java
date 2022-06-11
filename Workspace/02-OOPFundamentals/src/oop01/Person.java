package oop01;

public class Person {
	
	//default value int-0;double-0.0,object-null
	
	//instance variables
	private String firstName;
	private String lastName;
	private String city;
	
	public void show() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: "+ lastName);
		System.out.println("City:" + city);
	}

	public static void main(String[] args) {
		//local variables
		Person obj1 = new Person();
		obj1.firstName="Mahesh";
		obj1.lastName="Kad";
		obj1.city="Pune";
		
		Person obj2 = new Person();
		obj2.firstName="Sanket";
		obj2.lastName="Patil";
		obj2.city="kini";

		obj1.show();
		obj2.show();
	}

}
