public class Test {

    public void car_details(double Arai_Mileage , String Fuel_Type,
                            int Engine_Displacement , 
                            int Cylinders ,double Max_Power,
                            double Max_Torque , int Seating_Capacity,
                            String Transmission_Type,int Boot_Space,
                            int Fuel_Tank ,String Body_Type,int Ground_Clearance_Unladen   
                            )
    {   
        System.out.println("Swift Car Details");
        System.out.println("Mileage :" + Arai_Mileage);
        System.out.println("Fuel_Type :" + Fuel_Type);
        System.out.println("Engine_Displacement :" + Engine_Displacement);
        System.out.println("Cylinders :" + Cylinders);
        System.out.println("Max_Power :" + Max_Power);
        System.out.println("Max_Torque :" + Max_Torque);
        System.out.println("Seating_Capacity :" + Seating_Capacity);
        System.out.println("Transmission_Type :" + Transmission_Type);
        System.out.println("Boot_Space :" + Boot_Space);
        System.out.println("Fuel_Tank :" + Fuel_Tank);
        System.out.println("Body_Type :" + Body_Type);
        System.out.println("Ground_Clearance_Unladen : " + Ground_Clearance_Unladen);


    }





public static void main(String[]args){

    Test t1 = new Test();
    t1.car_details(22.75, "Petrol",1197,3,80.46,111.7,5,"Automatic",265,37,"hatchback",163);



 }
    
}
