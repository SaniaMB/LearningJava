public class ToString {
    public static void main(String[] args) {

//        .toString() = Method inherited from the object class.
//                      Used to return a String representation of an Object.
//                      By default, it returns a hash code as a unique identifier.
//                      It can be overridden to provide meaningful detail.

        Car1 car = new Car1("Mustang","Red");
        Car1 car1 = new Car1("BMW","Blue");

        System.out.println(car);
        System.out.println(car1);

    }
}
