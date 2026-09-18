//subclass
public class Student extends Person{

    double gpa;

    Student(String first ,String last , double gpa){
        //to pass "first" and "last" up to the parent (Person) constructor
        // super  calls Person's constructor first
        super(first, last);//Person(first,last)
        this.gpa = gpa;
    }
        void showGPA(){
            System.out.println(this.first + "'s gpa is  " + this.gpa);
        }




}
