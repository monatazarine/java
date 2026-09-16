//array of objects
public class Main{
    public static  void main(String[] args){
        Car car1 = new Car("Mustang", "red");
        Car car2 = new Car("Corvette","grey");
        Car car3 = new Car("BMW" ,"white");


        //Car[] cars = new Car[3];
        //to create an array of obj
        //Car[]: the data type of what we are storing in the array
        //cars: name of the array
        //Car[3] the size of the array

        //Car[] cars = {car1,car2,car3};

        //when creating an array of abj u can create anonymous obj
        //then assigning them to the array
        //we call the constructor and pass the args
        Car[] cars = {new Car("Toyota","pink"),
                      new Car("Subaru","black")};

        // to iterate through this array we can use a for loop

        //for (int i = 0; i < cars.length; i++) {
        //    cars[i].drive();
        //}

        //or an enhanced for loop
        //Car => data type of each ele in the array
        //nickname the ele of the array => car
        // ": cars" => in an array of cars

        for(Car car: cars){
            car.drive();
        }

        //change the color of each car
        for(Car car: cars){
            car.color = "blue";
        }

    }

}