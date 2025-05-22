
public class ObjectOp {
    public static void main(String[] args) {

        //object = An entity that holds data (attributes)
        //         and can perform actions (methods)
        //         it is a reference data type

        Car car = new Car();

      /*  System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price); */

        System.out.println(car.isRunning);
          car.start();
        System.out.println(car.isRunning);
          car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();


    }
}
