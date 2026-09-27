

public class Main {
    public static void main(String[] args)  {
        //Anonymous class = a class that doesn't have a name .Cannot br reused .
        //                  Add custom behavior without having to create a new class .
        //                  Often for one time users (TimerTask, Runnable ,callbacks)

        Dog dog1 = new Dog();
        dog1.speak();
        //what if there is a unique dog
        //instead of writing separate class file (UniqueDog extends Dog) just to change one method
        //creating a nameless subclass right on the spot for dog2 to give it unique behavior
        Dog dog2 = new Dog(){
            //can define any unique features or override methods
            @Override
            void speak(){
                System.out.println("Ruh Roh !!");
            }

        };
        dog2.speak();


    }
}
