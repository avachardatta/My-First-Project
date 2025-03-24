public class Car extends Vehicle {

    private int fuelLevel;

	public Car(String brand, int speed, int fuelLevel) {
		super(brand, speed);  // super is use to access parent class properties
		this.fuelLevel = fuelLevel;
	}
	
	
	
    @Override
	void start()  // Methods from parent class Vehicle
	{
		System.out.println("Car is starting with fuel level : " + fuelLevel + " %");
	}
	
	
    @Override
	void stop()   // Methods from parent class Vehicle
 	{
		System.out.println(brand + " Car is stopping");
	}

}
