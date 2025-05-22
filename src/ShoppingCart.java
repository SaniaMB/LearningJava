import java.util.Scanner;


public class ShoppingCart {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy: ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like to buy: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;
        char currency = '$';

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
