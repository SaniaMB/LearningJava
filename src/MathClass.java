import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        double result;

        result = Math.pow(2,5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(4.55);
        result = Math.floor(5.67);
        result = Math.max(10,20);
        result = Math.min(10,20);

        /* System.out.println(result);
        System.out.println(Math.PI);
        System.out.println(Math.E); */ 


        // HYPOTENUSE  c = Math.sqrt( a^2 + b^2 )

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();

    }
}
