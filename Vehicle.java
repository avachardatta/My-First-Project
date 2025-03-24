public abstract class Vehicle {

    protected String brand;
    protected int speed;
    
    
    
    public Vehicle(String brand , int speed)
    {
        this.brand = brand;
        this.speed = speed;
        
    }

    
    abstract void start();
    abstract void stop();
    
    
    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }





}
