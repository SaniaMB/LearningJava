import java.io.PrintStream;
import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Convert to celsius or fahrenheit? ( C or F ): ");
        String unit = scanner.next().toUpperCase();
        
        double result = unit.equals("C")? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("The converted temperature is %.2f ", result);

        scanner.close();

    }
}
