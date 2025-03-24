public class VehicleSystem {


    public static void main(String[] args) {
		
		
		// Creating an object
		
		Vehicle car = new Car("Toyota" , 120 , 20);
				
				
		car.showDetails();
		car.start();
		car.stop();
				
		System.out.println("----------------------------");
		
		
		
		Vehicle bike = new Bike("Honda" , 80, true);
		
		bike.showDetails();
		bike.start();
		bike.stop();
		

    

}
