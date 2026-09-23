
//Exception = An event that interrupts the normal flow of a program


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO !");
        } catch (InputMismatchException e) {
            System.out.println("YOU NEED TO ENTER A NUMBER !");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This will always be executed");
        }


    }
}
