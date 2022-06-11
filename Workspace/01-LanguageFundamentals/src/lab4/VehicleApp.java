package lab4;

public class VehicleApp {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("ABC1234", "KIA", 2500000, 25.4);
		Vehicle v2 = new Vehicle("ABC1784", "TATA", 2300000, 28.4);
		
		v1.displayVehicleInfo();
		v2.displayVehicleInfo();
		
		System.out.println("*******************");
		
		if (v1.getPrice()<v2.getPrice()) {
			System.out.println(v1.getBrand() + " is have lower price");
		}
		else
			System.out.println(v2.getBrand() + " is have lower price");
		
		if (v1.getMileage()>v2.getMileage())
			System.out.println(v1.getMileage() + "is have lower Milege");
		
		else 
			System.out.println(v2.getMileage() + "is have best Milege for " + v2.getBrand() );
	}

}
