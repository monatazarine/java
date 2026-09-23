

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("Enter the number of fruit You would like : ");
        int numbOfFruit = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i <= numbOfFruit; i++){
            System.out.print("Enter fruit number " + i + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }
        System.out.println(fruits);

        scanner.close();

    }
}
