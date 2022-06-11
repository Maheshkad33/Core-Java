package lab4;

public class Vehicle {
	
	private String regNo;
	private String brand;
	private double price;
	private double mileage;
	
	
	public Vehicle(String regNo, String brand, double price, double mileage) {
		
		this.regNo = regNo;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}
	
	public void displayVehicleInfo() {
		System.out.println("*******Vehicle Info******");
		System.out.println("Registration No:"+ regNo);
		System.out.println("Brand Name : "+ brand);
		System.out.println("Vehicle Price: "+ price);
		System.out.println("Vehicle mileage: "+ mileage);
	}

	public double getPrice() {
		return price;
	}

	public double getMileage() {
		return mileage;
	}

	public String getBrand() {
		return brand;
	}
	
	
	
	

}
