import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {

//        ArrayList =  A resizeable array that stores objects (autoboxing).
//                     Arrays are fixed in size, but ArrayLists can change.


      ArrayList<Integer> list = new ArrayList<>();  // Can change the wrapper classes.

      list.add(3);
      list.add(1);
      list.add(2);
      list.add(4);
      list.add(1);

      list.removeFirst();  // Or list.remove(0);
      list.set(0,3);

        System.out.println(list);

        System.out.println();

        System.out.println(list.get(1)); // list
        System.out.println(list.size());

        System.out.println();

        Collections.sort(list);  // "Collections" is a framework
        System.out.println(list);

        System.out.println();

        for(int num : list){
            System.out.println(num);
        }

    }
}
