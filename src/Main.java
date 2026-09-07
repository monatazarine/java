import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);


        String[] foods =   new String[3];
        for (int i = 0; i < foods.length ;i++){
            System.out.print("Enter the food : ");
            foods[i] = scanner.nextLine();

        }
        for (String food : foods){
            System.out.println(food);
        }

        scanner.close();




    }
}
