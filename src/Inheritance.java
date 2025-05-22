public class Inheritance {
    public static void main(String[] args) {

//    Inheritance = One class inherits the attributes and methods
//                  from another class
//                  child <- parent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();
    }
}
