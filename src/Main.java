//2D arrays = an array where each el is an array useful for storing a matrix of data
public class Main {

    public static void main (String[] args){
        String[] fruits = {
                "Apple",
                "Banana",
                "Orange",
                "Strawberry",
                "Mango",
                "Pineapple",
                "Blueberry",
                "Watermelon"
        };
        String[] vegetables = {
                "Carrot",
                "Broccoli",
                "Spinach",
                "Potato",
                "Tomato",
                "Cucumber",
                "Bell Pepper",
                "Onion"
        };
        String[] meats = {
                "Chicken",
                "Beef",
                "Pork",
                "Lamb",
                "Turkey",
                "Duck",
                "Veal",
                "Venison"
        };
        String[][] groceries = {{"Apple","Banana","Orange"},
                                {"Carrot","Broccoli","Potato"},
                                {"Chicken","Beef","Fish"}};
        groceries[0][0] = "Kiwi";
        for (String[] foods: groceries){
            for(String food: foods){
                System.out.println(food );
            }
        }
    }

}



