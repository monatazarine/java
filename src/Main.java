//Composition = "Part of" relationship between objects
//the child object's lifecycle is completely tied to the parent object
//              For example an Engine is "part of " a car
//              Allows complex obj to be constructed from smaller objs

public class Main{
    public static  void main(String[] args) {

        Car car = new Car("Corvette", 2025,"V8");

        //System.out.println(car.engine);
        // result =Engine@31dc339b , because engine is an obj
        //instead we will the access modifier
        System.out.println(car.engine.type);

        car.start();


    }
}
