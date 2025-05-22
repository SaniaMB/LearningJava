import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many if else statements
        //                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine().trim();
        day = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();

        switch(day){
            /* case "Monday" -> System.out.println("Its a weekday! 😭");
            case "Tuesday" -> System.out.println("Its a weekday! 😔");
            case "wednesday" -> System.out.println("Its a weekday! 😕");
            case "Thursday" -> System.out.println("Its a weekday! 🫤");
            case "Friday" -> System.out.println("Its a weekday! 😌");
            case "Saturday" -> System.out.println("Its the weekend! 😏");
            case "Sunday" -> System.out.println("Its the weekend! 💃🏻"); */

            case "Monday","Tuesday","wednesday","Thursday","Friday" ->
                    System.out.println("Its a weekday! 😭");
            case "Saturday","Sunday" -> System.out.println("Its the weekend! 😏");

            default -> System.out.println(day + " is not a day!");
        }

        scanner.close();
    }
}
