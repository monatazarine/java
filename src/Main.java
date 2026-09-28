//Genetics = a concept where you can write a class , interface , or method
//          that is compatible with a different data type
//          <T> type parameter (placeholder that gets replaced with a real type later)
//          <String> type argument (specifies the type,telling the compiler, "Make this box specifically for Strings")
//Instead of writing separate classes for StringBox, IntBox, or DoubleBox
// you write one generic template using a type parameter like <T>

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        //Example 1:Built-in Generics
        //passing <String> ensures that only strings can be added to the list
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");

        //Example 2:Custom Generic Class
        Box<String> box1 = new Box<>();
        //box1 replaces T with String:its item must be a String
        box1.setItem("Book");
        System.out.println(box1.getItem());

        //box2 replaces T with Integer: its item must be a number
        Box<Integer> box2 = new Box<>();

        box2.setItem(2);
        System.out.println(box2.getItem());

        //Example 3:Multiple Type Parameters
        //A class can take multiple type parameters ( <T, U> ; <K, V>)
        Product<String,Double>  product1 = new Product<>("Apple",0.50);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());


        Product<String, Integer> product2 = new Product<>("Ticket",15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
