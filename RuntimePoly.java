import java.util.Scanner;

public class RuntimePoly {
    public static void main(String[] args) {

//        Runtime Polymorphism = When the method that gets executed is decided
//                               at runtime  based on the actual type of object.

        Scanner scanner = new Scanner(System.in);

        Animal1 animal1;

        System.out.print("Would you like a Dog or a Cat? (1 = Dog , 2 = Cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal1 = new Dog1();
            animal1.speak();
        }else{
            animal1 = new Cat1();
            animal1.speak();
        }


        scanner.close();

    }
}
