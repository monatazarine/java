//Interface =  a blueprint for a class that specifies a set of methods 
//that the class must implement.
//An interface in Java is like a contract. It specifies what an object can do, leaving it up to the implementing class to define how it does it.
// Interfaces are used to achieve abstraction and multiple inheritance.(a class can have parent classes)
public class Main{
    public static  void main(String[] args) {
             Rabbit rabbit = new Rabbit();
             rabbit.flee();

             Hawk hawk = new Hawk();
             hawk.hunt();
             
             Fish fish = new Fish();
             fish.flee();
             fish.hunt();


    }
}
