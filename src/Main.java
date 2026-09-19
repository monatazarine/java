
//Abstraction : the process of hidden implementation details and showing only the essential features;
//Abstract classes can't be instantiated directly


public class Main{
    public static  void main(String[] args) {


       //Shape shape1 = new Shape(); => this line will give an error because we can't instantiate an abstract class directly(we can't create an object of an abstract class)
        Circle circle1 = new Circle(3);
        Triangle triangle1 = new Triangle(4, 5);

        circle1.display();
         System.out.println("Area of Circle: " + circle1.area());
        triangle1.display();
         System.out.println("Area of Triangle: " + triangle1.area());


       

    }
}
