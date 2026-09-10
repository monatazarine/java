// SEARCH AN ARRAY

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    String[] fruits ={"Apple",
            "Banana",
            "Orange",
            "Strawberry",
            "Mango",
            "Pineapple",
            "Blueberry",
            "Watermelon" };
    boolean isFound = false;
    String target ;


    System.out.print("Search : ");
    target = scanner.nextLine();
    // Linear search
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(target)) {
                System.out.println("Element at index : " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found !!");
        }
        scanner.close();
    }

    }



