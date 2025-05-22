public class Variables {
    public static void main(String[] args) {

        //Primitive (simple value stored directly in memory) variables are int , double , char , boolean , float and so on.

        int age = 21;
        int quantity = 15;
        int year = 2025;
        System.out.println(quantity);
        System.out.println("The year is " + year);

        double price = 19.99;
        System.out.println("$" + price);

        boolean isStudent = true;
        System.out.println(isStudent);
        if(isStudent){
            System.out.println("You are a student!");
        }else{
            System.out.println("You are not a student!");
        }

        // Reference (memory address (stack) that points to the heap) variables are string , array and object

        String name = "Hi there!";
        String food = "Pizza";
        System.out.println("Oh!, " + name);
        System.out.println("Your fav food is: " + food);

        System.out.println("your choice is: " + year + " " + age );


    }
}
