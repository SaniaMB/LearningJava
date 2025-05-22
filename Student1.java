public class Student1 extends Person{

    double gpa;

    Student1(String first , String last , double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}
