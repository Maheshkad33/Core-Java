package oop02;

public class PersonApp {

	public static void main(String[] args) {
		//local variables
		Person obj1 = new Person();
		obj1.getData("Mahesh", "Kad", "Pune");
		
		Person obj2 = new Person();
		obj2.getData("Sanket", "Patil", "Kini");

		obj1.show();
		obj2.show();
	}

}
