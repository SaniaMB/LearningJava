import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithUser {
    public static void main(String[] args) {

        /*String[] fruits = {"apple" , "orange","banana","coconut"};

        //Arrays.sort(fruits);
        Arrays.fill(fruits,"pineapple");

        for(String fruit : fruits){
            System.out.println(fruit); }
        */
        Scanner scanner = new Scanner(System.in);

       // String[] foods = new String[3];

        System.out.print("Enter the number of dishes: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[size];

        for(int i = 0 ; i < foods.length ; i++){
            System.out.print("Enter a food: ");
            foods[i]=scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
