import java.util.Scanner;
/*
what item would u like to buy
price for each
how many

u bought x <items>
your total is __Rs
 */

public class ShoppingCart {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        String itemName;
        double pricePerItem;
        int noOfItems;
        double totalPrice;

        System.out.print("What item would you like to buy? ");
        itemName = scanner.nextLine();

        System.out.print("Enter the price for one " + itemName + " in rupees: ");
        pricePerItem = scanner.nextDouble();

        System.out.print("How many " + itemName + "(s) do you want to buy? ");
        noOfItems = scanner.nextInt();

        totalPrice = noOfItems * pricePerItem;

        System.out.println("\n-----------Your Cart-----------\n");
        System.out.println("You bought " + noOfItems + " " + itemName + "(s).");
        System.out.println("Your total is " + totalPrice + "Rs.");
        System.out.println("Thank you for shopping!");

        scanner.close();
    }

}
