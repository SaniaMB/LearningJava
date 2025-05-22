import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /,^): ");
        String operator = scanner.next().charAt(0) + "";

        System.out.print("Enter another number:");
        double num2 = scanner.nextDouble();

        switch(operator){
            case "+" ->
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

            case "-" ->
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));

            case "*" ->
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));

            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0!");
                } else {
                    System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2));
                }
            }
            case "^" ->
                System.out.println("The power of " + num1 + " and " + num2 + " is " + Math.pow(num1,num2));

            default ->
                System.out.println("Error: Invalid operator entered.");
        }
        
        scanner.close();

    }
}
