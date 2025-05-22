import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int random_num;
        int guess;
        int count = 0;
        int min = 1;
        int max = 100;

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d to %d: \n" , min , max);
        random_num = random.nextInt(max - min + 1) + min;

        do {
            System.out.print("Enter a Number : ");
            guess = scanner.nextInt();

            if(guess < random_num)
                System.out.println("Too low!");
            else if(guess > random_num)
                System.out.println("Too high!");

            count ++;
        } while (guess != random_num);

        System.out.println("Yay you have guessed the right number!! -> " + guess);
        System.out.println("Attempts taken -> " + count);

        scanner.close();

    }
}
