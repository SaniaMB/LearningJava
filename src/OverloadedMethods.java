public class OverloadedMethods {
    public static void main(String[] args) {

        // OVERLOADED METHODS -> Methods that share the same name, but different parameters.
        //                       Signature = Name + Parameters

        //String pizza = bakePizza("Flat bread");

        //String pizza = bakePizza("Flat bread","Mozzarella");

        String pizza = bakepizza("Flat bread","Mozzarella","Pepperoni");

        System.out.println(pizza);

    }

    static String bakePizza(String bread){
        return bread + " " +  "pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese + " " + bread + " " + "pizza";
    }
    static String bakepizza(String bread,String cheese,String topping){
        return topping + " " + cheese + " " + bread +" " + "pizza";
    }
}
