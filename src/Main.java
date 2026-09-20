//Getters = methods that retrieve/access the value of a private field
//Setters = methods that modify the value of a private field

public class Main{
    public static  void main(String[] args) {

         Dog dog1 = new Dog("Max", "German Shepherd", 1);  
        // System.out.println("Dog name: " + dog1.name + ", Breed: " + dog1.breed + ", Lifespan: " + dog1.lifespan + " years");  
        // The above line will cause a compilation error because the fields are private and cannot be accessed directly from outside the class.
        // Instead, we can use the getter methods to access the values of the private fields:
        System.out.println("Dog name: " + dog1.getName() + ", Breed: " + dog1.getBreed() + ", Lifespan: " + dog1.getLifespan() + " years");
        //Dog.name = "Duke"; // This line will cause a compilation error 
        dog1.setName("Duke"); 


    }
}
