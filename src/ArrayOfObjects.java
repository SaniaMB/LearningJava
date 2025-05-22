public class ArrayOfObjects {
    public static void main(String[] args) {


        /*  Car1 car1 = new Car1("Mustang","Blue");
            Car1 car2 = new Car1("Corvette","Red");
            Car1 car3 = new Car1("Charger","Yellow");
            Car1[] cars = {car1 , car2 , car3};

            OR  */


        Car1[] cars = { new Car1("Mustang","Blue"),
                        new Car1("Corvette","Red"),
                        new Car1("Charger","Yellow")
                      };

        /*for(int i = 0 ; i < cars.length ; i++){
            cars[i].drive();
        }*/

        for(Car1 car : cars){
            //car.drive();
            car.color ="Black";
            car.drive();
        }





    }
}
