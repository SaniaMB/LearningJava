public class GetSet {
    public static void main(String[] args) {

//        They help protect object data and add rules for accessing or modifying them.
//        GETTERS = Methods that make a field READABLE.
//        SETTERS = Methods that make a field WRITABLE.

        Car1 car1 = new Car1("Charger" , "Yellow ");

        //car1.model = "Corvette"; If we don't want this to happen , private modifier doesn't work.
                                  // Hence, we use getter.

        car1.setColor("Blue");

        System.out.println(car1.getColor() + " " + car1.getModel());

    }
}
