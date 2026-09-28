import java.util.Scanner;

//Enums = (Enumerations) a special kind od class that
//        represents a fixed set of constants
//        They improve code readability and are easy to maintain
//        More efficient with switches when comparing String
public class Main {
    public static void main(String[] args)  {

        Day day = Day.FRIDAY;
        System.out.println(day);
        //=> FRIDAY
        System.out.println(day.getDayNumber());
        //=> 6


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week :");
        String choice = scanner.nextLine().toUpperCase();
        try{
            //is a built-in method ,takes a string("FRIDAY") converts it into the matching enum(Day.FRIDAY)
            Day dayOfChoice = Day.valueOf(choice);
            switch (dayOfChoice) {
                case MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY -> System.out.println("Its a weekday!");
                case SATURDAY, SANDAY -> System.out.println("Its a weekend!");


            }
        }
            catch(IllegalArgumentException e){
                System.out.println("Please enter a valid day!");


        }
        scanner.close();

    }
}
