

public class Main {



    public static void main (String[] args) {
        //create a car obj:
        Car car = new Car();
        System.out.println(car);
        // =>we will get a memo address :Car@5f184fc6

        //to access one of this att
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.price);

        car.start();
        car.stop();
        car.drive();



    }


}


