public class Super {
    public static void main(String[] args) {

//        Super = refers to teh parent class ( subclass <- superclass)
//                Used in constructors and method overriding
//                Calls the parent constructor to initialize attributes

       Person person = new Person("Harry","Potter");
       Student1 student1 = new Student1("Tom","Riddle",4.25);

       person.showName();
       student1.showName();
       System.out.println(student1.gpa);
       student1.showGpa();


    }
}
