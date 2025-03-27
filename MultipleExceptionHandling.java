import java.util.Scanner;

public class MultipleExceptionHandling {


public static void main(String[] args) {
		
		
		int [] num = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter index upto 0 to 4 ");
			int index = sc.nextInt();
			
			System.out.println("Value at index : " + index + " is " + num[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : " + " Index out of bond Exception Please Enter a number between 0 to 4");
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("Please Enter valid integer");
		}finally {
			System.out.println("Programme Executed Successfully");
		}
		
		
		
		
		
		
		
		
		

	}





}
