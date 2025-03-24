public class Bike extends Vehicle{
	
		
    private boolean helmateReuuired;
    
    
    public Bike(String brand, int speed , boolean helmateReuuired) {
        super(brand, speed); // super is use to access parent class properties
        this.helmateReuuired = helmateReuuired;
    }
    
    
    @Override
    void start () // Methods from parent class Vehicle
    {
        System.out.println("Bike is starting helmate Requred : " +  helmateReuuired);
    }
    
    
    @Override
    void stop() // Methods from parent class Vehicle
    {
        System.out.println ( brand + "Bike is stopping");
    }

}
