import java.util.Scanner;

public class Rectanglearea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("The area is: " + area + " cm️^2");

        scanner.close();

    }
}
