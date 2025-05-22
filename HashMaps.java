import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

//           HashMaps = A data structure that stores key-value pairs
//                      Keys are unique, but values can be duplicated
//                      Does not maintain any order, but is memory efficient
//                      HashMap<key, Value>

       HashMap<String, Double> map = new HashMap<>();

        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.50);
        //map.put("orange",0.90);

        //map.remove("apple");

        System.out.println(map);
        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsKey("ban"));

        if(map.containsKey("prune"))
            System.out.println(map.get("apple"));
        else
            System.out.println("Key not found");

        System.out.println(map.containsValue(0.30));

        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }


    }
}
