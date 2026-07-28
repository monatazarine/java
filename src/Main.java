import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        //user input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
        System.out.println("Are you a student ?(true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("you are NOT enrolled ");
        }
        scanner.close();

    }
}
