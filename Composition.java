public class Composition {
    public static void main(String[] args) {

//        Composition = represents a "part-of" relationship between objects.
//                      For example, an Engine is "part of" a Car.
//                      Allows complex objects to be constructed from smaller objects.

         Car4 car4 = new Car4( "Corvette" , 2025 , "V8");

        System.out.println(car4.model);
        System.out.println(car4.year);
        System.out.println(car4.engine.type);
        car4.start();


    }
}
