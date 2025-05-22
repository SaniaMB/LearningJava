import static java.lang.Thread.sleep;

public class ForWithMagic {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!🎇");

    }
}
