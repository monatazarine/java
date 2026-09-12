public class Student {
    String name ;
    int age;
    double gpa;
    boolean isEnrolled;
    //constructor
    Student(String name ,int age , double gpa ){
        //assign
        //this refers to the obj currently constructing
        //in the first example : this is student1
        // we are assigning student1's name (this.name) equal to the name received("SpongeBob")
        this.name = name;
        this.gpa = gpa;
        this.age = age;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying !");
    }
}
