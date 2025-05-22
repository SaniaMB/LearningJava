import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

      // Generics = A concept where you can write a class , interfaces , or method
      //            that is compatible with different data types.
      //            <T> type parameter (placeholder that gets replaced with a real type)
      //            <String> type argument (specifies the type)

        // example of generics

      /*  ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("coconut");   */

     Box<Integer> box = new Box<>();

         box.setItem(4);

        System.out.println(box.getItem());

        Product<String , Integer> product = new Product<>("Comb",50);

        System.out.println(product.getItem() + " of price " + product.getPrice());

    }
}
