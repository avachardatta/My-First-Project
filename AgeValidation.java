import java.util.Scanner;

public class AgeValidation {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You must be at least 18 years old.");
            }

            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();  // Fixed scanner closing
            System.out.println("Program execution completed.");
        }
    }


}
