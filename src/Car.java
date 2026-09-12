//create a class
public class Car {

// attributes
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 538000.99;
    boolean isRunning = false;

    // methods

    void start(){
        isRunning = true;
        System.out.println("You started the engine!");}
    void stop(){
        isRunning= false;
        System.out.println("You stopped the engine!");}
    void drive(){
        isRunning= false;
        System.out.println("You drive the " +model );}

}
