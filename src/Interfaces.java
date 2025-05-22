public class Interfaces {
    public static void main(String[] args) {

//           Interface = A blueprint for a class that specifies a set of abstract methods
//                       that implementing classes MUST define.
//                       Supports multiple inheritance-like behaviour.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish1 = new Fish1();

        rabbit.flee();
        hawk.hunt();
        fish1.flee();
        fish1.hunt();

        
    }
}
