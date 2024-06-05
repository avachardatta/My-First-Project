public class sta {
    

    static String name = "Morgan Stanely";
    


    static double total_salary(int basic_salary , int hra , int da)
    {
        double total;
        total = basic_salary + hra + da;
        System.out.println("Basic salary for intern");
        System.out.println("Total salary : " + total);

        return total;

    }



    public static void main(String[]args){

        total_salary(12000, 4000, 2000);


         




    }
}
