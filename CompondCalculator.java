import java.util.Scanner;

public class CompondCalculator {
    public static void main(String[] args) {

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = scanner.nextDouble() / 100 ;

        System.out.print("Enter the # of times compounded per year : ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years : ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded , timesCompounded * years);

        System.out.println("The amount after " + years + " year/(s)" + " is: $" + amount);
        System.out.printf("The amount after %d years is %.2f",years , amount);

        scanner.close();


    }
}
