
//ArrayList = a resizable array that stores obj(autoboxing )
//            Arrays are fixed in size .But ArrayLists can change

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //creating an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Appends an item to the end
        list.add(2);
        list.add(3);
        list.add(36);

        System.out.println(list);//=> [2, 3, 36]

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println(fruits);//=> [Apple, Strawberry, Mango, Banana]
        //Removes the item at that index
        fruits.remove(3);
        System.out.println(fruits);//=> [Apple, Strawberry, Mango]
        //Replaces the item at a specific index
        fruits.set(0,"Pineapple");
        System.out.println(fruits);//=>[Pineapple, Strawberry, Mango]
        //Retrieves the item at a specific index
        System.out.println(fruits.get(1));//=>Strawberry
        //Returns the total count of elements
        System.out.println(fruits.size());//=>3
        //Sorts the elements alphabetically/numerically
        Collections.sort(fruits);
        System.out.println(fruits);//=>[Mango, Pineapple, Strawberry]



    }
}
