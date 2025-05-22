import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLPro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the no. of food would like: ");
        int numFood = scanner.nextInt();
        scanner.nextLine();

        for( int i = 1 ; i <= numFood ; i++){
            System.out.print("Enter food no. " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
