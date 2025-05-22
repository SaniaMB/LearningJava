import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[] args) {

        // .substring() = a method used to extract a portion os a string
        //                 string.substring(start,end)

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if(email.contains("@")){

        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1 );

        System.out.println(domain);
        System.out.println(username);

        }else{
            System.out.println("Emails must contain an @ sign!!!");
        }

        //String email = "sania0934@gmail.com";
        //String username = email.substring(0,5);
        //String domain = email.substring(10,19); // or just 10

        scanner.close();

    }
}
