import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

//        Exception = An event that interrupts the normal flow of a program
//                    (Dividing by zero , file not found, mismatch input type)
//                    Surround any dangerous code with a try{} block
//                    try{} , catch{} , finally{}

        // Scanner scanner = new Scanner(System.in);

        try( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        }catch (InputMismatchException num){
            System.out.println("That wasn't a number");
        }

        try{
            System.out.println(1/0);
        }catch (ArithmeticException nickname){
            System.out.println("YOU CAN'T DIVIDE BY ZERO IDIOT!");
        }

        // Following can catch all exceptions
        // Its like a safety net use it when you can't anticipate something.

        catch (Exception E){                     // Not really a good practice using it all by itself
            System.out.println("Something went wrong");
        }

        finally {      // Cleaning up program when you are done with it
            // scanner.close();  java will do automatically
            System.out.println("This always executes");
        }



    }
}
