import java.util.HashMap;

//HashMap = a data type structure that stores key value pairs(like a dictionary)
//          Keys are unique , values can be duplicated
//          Does not maintain any order for  memory efficiency
//          HashMap <Key, Value>
public class Main {
    public static void main(String[] args)  {
        //Key = String(product) ; Value = Double(price)
        HashMap<String , Double> map = new HashMap<>();
        //Inserts a new key-value pair
        map.put("apple", 0.50);
        map.put("orange", 0.70);
        map.put("banana", 0.25);

        System.out.println(map);
        //{orange=0.7, banana=0.25, apple=0.5}

        //Every key must be unique
        // If an existing key is added :
        //map.put("banana", 1.25);
        //it overwrites the old value


        //to get te value associated with the specified key
        System.out.println(map.get("apple"));
        //=>0.5

        //to check if a key/value exist
        System.out.println(map.containsKey("banana"));
        //=> true
        if(map.containsValue(0.25)){
            System.out.println("it exist");
        }else {
            System.out.println("doesn't exist");
        }

        //the size of a map
        System.out.println(map.size());
        //=> 3

        //to custom format a map
        // for every in key the map.get(key) looks up the corresponding price
        //keySet():extracts all the keys into a set (["apple", "orange", "banana"])
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));

        }





    }
}
