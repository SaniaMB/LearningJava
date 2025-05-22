import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SAN weight Converter , The most accurate of them all!!");

        System.out.println("Please enter a choice: 1 -> convert lbs To kgs , 2 -> convert kgs to lbs ");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter Your weight:");
            double weight = scanner.nextDouble();
            double new_Weight = weight * 0.45359237;
            System.out.printf("Your weight in kgs is %.2f" , new_Weight);
        } else if (choice == 2) {
            System.out.println("Enter Your weight:");
            double weight = scanner.nextDouble();
            double new_weight = weight * 2.20462;
            System.out.printf("Your weight in lbs is %.2f" ,new_weight);
        }else{
            System.out.println("Please enter a valid choice!!");
        }

        scanner.close();
    }
}
