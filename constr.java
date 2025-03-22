import java.util.Arrays;

public class constr {

        
        int sum( int a , int b){
            int c = a + b;
            System.out.println(c);
            return c;
        }


        int divide( int a , int b)
        {
            try{
            int c = a / b;
            System.out.println(c);
            return c;
            } catch (Exception e) {
                System.out.println("Can not divide by zero");
                return -1;
            }    



        }


        public static void main(String[] args)
        {
        

            // constr c1 = new constr();
            // c1.sum(10,10);
            // c1.divide(100, 0);


            // int [] [] d = new int[2][3];

            // int [] [] d = {{10,20,30} ,{40,50,60}};



            // // for( int[] ab : d)
            // // {
            // //     System.out.println(ab);
            // // }


            // System.out.println(d[0][0]);
            // System.out.println(Arrays.deepToString(d));




        }
        
    }
