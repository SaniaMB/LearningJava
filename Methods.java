public class  Methods {
    public static void main(String[] args) {
        
        // method = a block of reusable code that is executed when called()
        String name = "sania";
        int age = 25;

        // happyBirthday(name , age);

        String fullname = getname("Spongebob","Squarepants");
        System.out.println(fullname);

        System.out.println(agechecker(12));

    }

    public static void happyBirthday(String name , int age) {
        System.out.println("\nHappy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n" , name);
        System.out.printf("You are now %d years old!\n" , age);
    }

    static String getname(String first , String last){
        return first + " " + last;
    }

    static boolean agechecker(int age){
        return age >=18;
}

}
