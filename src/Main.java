
// The "Object" class comes with a built-in method named toString().
//if you try to print an obj (like System.out.println(car1);),
//Java calls the toString() method, which outputs something like:
//Car@5f150435

public class Main{
    public static  void main(String[] args) {
        Car car1 = new Car("Ford","Mustang", 2004, "Black");
        Car car2 = new Car("Toyota","Corolla", 2010, "White");     
         //to print object properties we need to override the toString() method in the class

        System.out.println(car1);//this  line turns into System.out.println(car1.toString());
        System.out.println(car2);
        





    }
}
