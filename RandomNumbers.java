import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

       Random random = new Random();

       int num1 = random.nextInt(1 , 6);
       int num2 = random.nextInt(1 , 7);  // The second number is exclusive hence it will not be printed ,
                                                       // so always add +1 to the desired number.
        System.out.println(num1);
        System.out.println(num2);


        double  num3 = random.nextDouble( 1 , 101);

        System.out.println(num3);

        boolean isHead = random.nextBoolean();

        if(isHead) {
            System.out.println("HEAD!");
        }else{
            System.out.println("TAIl!");
        }


    }
}
