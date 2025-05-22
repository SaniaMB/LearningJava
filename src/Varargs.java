public class Varargs {
    public static void main(String[] args) {

        //varargs = allows a method to accept a varying no. of arguments
        //          makes methods more flexible, no need for overloaded method
        //          java will pack the arguments into an array
        //          ... (ellipsis)

        System.out.println(add(1,2,3,4,10));
        System.out.println(avg(1,2,3,4,10));
        System.out.println(avg());
    }

    static int add(int...numbers){
        int sum = 0;

        for(int number: numbers){
            sum+=number;
        }

        return sum;
    }

    static double avg(double... numbers){

        double sum = 0;

        if(numbers.length==0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum/ numbers.length;
    }
}
