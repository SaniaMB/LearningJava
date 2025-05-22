public class ArithematicOperators {
    public static void main(String[] args) {

        int x = 10, y = 2 , z;

         z = x + y;
         // z = x - y;
         // z = x * y;
         // z = x / y;
         // = x % y;

        // System.out.println(z);

        // AUGMENTED ASSIGNMENT OPERATORS

        int a = 10 ;
        int b = 3;

        //a = a + b;   // += (This is an augmented operator )
        //a -= b;
        // a *= b;
        //a /= b;
        a %= b;

       // System.out.println(a);

        // INCREMENT AND DECREMENT OPERATORS

        int d = 2;

        //d++;
        d--;

      //  System.out.println(d);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]res

        double result = 3 + 4 * (7-5) / 2.0 ;  // First (7-5) , then 2 * 4 , later 8 / 2.0 and lastly 3 + 4;

        System.out.println(result);




    }
}
