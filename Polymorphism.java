public class Polymorphism {
    public static void main(String[] args) {

//        Polymorphism = "POLY" = "MANY"
//                       "MORPH" = "SHAPE"
//                        Objects can identify as other objects.
//                        Objects can be treated as objects of common superclass.
//                        Can also be done using interfaces.


Car2 car2 = new Car2();
Bike bike = new Bike();
Boat boat = new Boat();

// Car2[] cars = {car2 , bike,boat}; -> wrong

        Vehicle[] vehicles = {car2 , bike , boat};

        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
