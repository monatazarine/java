//Constructor = a method to initialize obj
//              pass arg to and set up initial values

public class Main {



    public static void main (String[] args) {

        //new Student = calling the constructor
        Student student1 = new Student("SpongeBob",32,1.2);
        Student student2 = new Student("Patrick",43,3.4);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);


        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();

    }


}


