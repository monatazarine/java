public class Car {
    String make;
    String model;
    int year ;
    String color;

    Car( String make, String model ,int year ,String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    //tells Java: "Ignore the default toString() from the Object parent class, and use my custom version instead!"

    public String toString() {
        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }
}
