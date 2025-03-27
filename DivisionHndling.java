import java.util.Scanner;

public class DivisionHndling {


    public static void main(String[] args) {
		
		
// DIvision By Zero Arithmetic Exception		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Select Numerator");
			int num = sc.nextInt();
			System.out.println("Enter Dominator");
			int denom = sc.nextInt();
			
			int result = num / denom;
			System.out.println("Result : " + result);
			
			
			
		}catch(ArithmeticException e)
		{
			System.out.println("Division by zero not allowed");
		}finally
		{
			sc.close();
			System.out.println("Programme Execute Complete");
		}
		
		
		
		
		
		
		
		
		
		
		

	}










}
