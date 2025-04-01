import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to All in One Grocery Shop");
        System.out.println("Choose Options:");
        System.out.println("1. View All Items");
        System.out.println("2. Add / Update Item");
        System.out.println("3. Remove An Item");
        System.out.println("4. Check if an item is available");
        

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline after nextInt()

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Fruits and Vegetables");
        ar.add("Grains");
        ar.add("Protein");
        ar.add("Dairy");
        ar.add("Healthy Fats");
        ar.add("Beverages");

        switch (choice) {
            case 1:
                System.out.println("List of Items: " + ar);
                break;

            case 2:
                System.out.println("Choose what to do:\n A. Add new item to shop\n B. Update an existing item");
                String options = sc.nextLine(); // Now it will work correctly

                if (options.equalsIgnoreCase("A")) {
                    System.out.println("Enter the item to add:");
                    String addItem = sc.nextLine();
                    ar.add(addItem);
                    System.out.println("Item added successfully! Updated List: " + ar);
                } else if (options.equalsIgnoreCase("B")) {
                    System.out.println("Enter the item you want to update:");
                    String oldItem = sc.nextLine();

                    if (ar.contains(oldItem)) {
                        System.out.println("Enter new item:");
                        String newItem = sc.nextLine();
                        int index = ar.indexOf(oldItem);
                        ar.set(index, newItem);
                        System.out.println("Item updated! Updated List: " + ar);
                    } else {
                        System.out.println("Item not found!");
                    }
                } else {
                    System.out.println("Invalid option! Please choose A or B.");
                }
                break;
                
            case 3 :
            	System.out.println("Choose item to remove");
            	String removeItem = sc.nextLine();
            	
            	if (ar.contains(removeItem)) {
                    ar.remove(removeItem);
                    System.out.println("Item removed successfully! Updated List: " + ar);
                } else {
                    System.out.println("Item not found in the shop.");
                }
                break;

            
            case 4 :
            	System.out.println("Enter the item to check");
            	String check = sc.nextLine();
            	if(ar.contains(check))
            	{
            		System.out.println("Yes item is present");
            	}else
            	{
            		System.out.println("Sorry we do not have this item");
            	}
            	

            default:
                System.out.println("Choose a valid option!");
        }

        sc.close();
    }

}
