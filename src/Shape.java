//abstract class 
public abstract class Shape {


             //abstract method : the child classes that extend the abstract class must implement(define) the abstract methods 
             abstract double area();
             //Concrete method : are methods that have a body and can be inherited .
             void display() {
                 System.out.println("This is a shape");
             }

}
