import java.util.Scanner;

public class ClearInputBuffer {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter your favorite color: ");
            String color = scanner.nextLine();

            System.out.println("Your are " + age + " years old");
            System.out.println("You like the colour " + color);

        }

    }
}
