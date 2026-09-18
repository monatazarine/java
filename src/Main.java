// super = a key word that refers to the parent class
//        subclass(child class )<= superclass(parent class)
//        used in constructors(calls the parent constructor to initialize att) and method overriding

public class Main{
    public static  void main(String[] args){

        Person person = new Person("SpongeBob","SquarePants");
        person.showName();

        Student student = new Student("Patrick","Star",2.1);
        student.showGPA();
        Employee employee = new Employee("SquidWard","Tentacles",50);

        employee.showSalary();
    }

}
