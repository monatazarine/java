
//Wrapper classes = allow primitive vals (int , char ...) to be treated as obj ,
//primitive types store raw values directly in memory for maximum performance.
// However, many utility features (like ArrayLists or generic data structures) only work with objects.

public class Main{
    public static  void main(String[] args) {
        //Autoboxing :: Automatic conversion from a primitive type to its wrapper class object.
        //rather than int a = 123;
        //we use wrapper classes to make a an obj
        //Integer a =  new Integer(123);
        //Double b = new Double(1.38);
        //Boolean c = new Boolean(true);

        Integer a = 123;//converts int 123 into an Integer object!
        Double b = 1.38;
        Boolean c = true;

        //Unboxing : Automatic conversion from a wrapper class object back to a primitive type.

        int x = a;//extracts the int value from the Integer object!
        double v = b;
        boolean y = c;

        //Parsing & Utility Methods:

        // to convert a primitive data type into a string
        String z = Integer.toString(123);

        // to convert a string  into a primitive data type
        int R = Integer.parseInt("123");
        double u = Double.parseDouble("1.87");
        char i = "Pizza".charAt(0);
        boolean s = Boolean.parseBoolean("true");

        //checks if a character is an alphabetical letter.
        char letter = 'a';
        System.out.println(Character.isLetter(letter));
        //result = true
        char letter1 = '$';
        System.out.println(Character.isLetter(letter1));
        //result = false
        //checks if a character is capital.
        char letter2 = 'B';
        System.out.println(Character.isUpperCase(letter2));





    }
}
