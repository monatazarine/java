
//Runtime Polymorphism = when the method that gets executed is determined at runtime based on the actual object type

import java.util.Scanner;
public class Main{
    public static  void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal myPet ;  //The variable myPet is just a blank placeholder .


        System.out.print("Enter your pet type (cat=1/dog=2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            myPet = new Cat();
            myPet.makeSound();
        } else if (choice == 2) {
            myPet = new Dog();
             myPet.makeSound();
        } else {
            System.out.println("Invalid choice. ");

        }     
        

    }
}
