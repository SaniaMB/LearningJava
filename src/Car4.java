public class Car4 {

    String model;
    int year;
    Engine engine;

    Car4(String model , int year , String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }

}
