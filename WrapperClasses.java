public class WrapperClasses {
    public static void main(String[] args) {


//      Wrapper classes = Allow primitive values (int , char , double , boolean)
//                        to be used as objects. "Wrap them in an object"
//                        Generally don't wrap primitive unless you need an object.
//                        Allows use of collections Framework and static Utility Methods.

              // The old way

//        Integer a = new Integer(12);
//        Double b = new Double(12.5);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);

        // Modern way (Autoboxing)

//         Integer a = 12;
//         Double b = 12.5;
//         Character c = '$';
//         Boolean d = true;
//         String e = "Sania";

         // Unboxing  - To convert wrapper class back to its primitive.

//        int x = a;
//        double y = b;
//        char z = c;
//        boolean p = d;

        // Primitive to String using utility method

//        String a = Integer.toString(123);
//        String b = Double.toString(12.5);
//        String c = Character.toString('R');
//        String d = Boolean.toString(true);
//
//        String x = a + b + c + d;
//
//        System.out.println(x);

        // String to primitive using utility method

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("12.5");
//        char c = "Pizza".charAt(0); // characters don't have a parse method
//        boolean d = Boolean.parseBoolean("true");

        //  few more ex

        char letter = '$';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
