import java.util.Scanner;

public class PasswordValidation {


    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			
			System.out.println("Enter your password");
			String password = sc.nextLine();
			if(password.length() < 6)
			{
				throw new InvalidPasswordException("Password Length should be more than 6");
			}
			System.out.println("Password set Successfully");
		}catch(InvalidPasswordException e)
		{
			 System.out.println("Error : " + e.getMessage());
		}finally
		{
			System.out.println("Programme Execute Successfully");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
