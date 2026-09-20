//Polymorphism = Obj can identify as other obj
//              it allows objects of different types (Car, Boat)
//              to be treated as instances of a shared parent class or interface (Vehicle)
public class Main{
    public static  void main(String[] args) {


        Animal myPet = new Dog(); // Polymorphism! A Dog identifying as an Animal
        myPet.makeSound();
        //If Animal is abstract, Java refuses to let you create a plain Animal object.
        // It forces you to pick a specific, real species like Dog or Cat.

    }
}
