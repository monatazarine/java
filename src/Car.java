public class Car {

    String model;
    int year ;
    Engine engine;//Created inside the Car!
    //Because new Engine(engineType) is executed directly inside the Car constructor,
    // the Engine is born with the Car and dies with the Car.

    Car(String model , int year , String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running !");
    }
}
