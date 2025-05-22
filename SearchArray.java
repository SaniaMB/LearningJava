import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 4, 9, 2, 8, 5, 3};
        int target = 7;
        String[] fruits = {"apple" , "orange","banana","coconut"};
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        String target1 = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target1 )) {   //target == numbers[i
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array!");
        }
    }
}
