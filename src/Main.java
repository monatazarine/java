import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "fruit.txt";
        ArrayList<String> fruits = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine())!= null){
                fruits.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found !");;
        } catch (IOException e) {
            System.out.println("Something went wrong !");;
        }
        Random random = new Random();

        //returns a random fruit from the list                                                         
        String fruit = fruits.get(random.nextInt(fruits.size()));
        System.out.println(fruit);



        Scanner scanner = new Scanner(System.in);
         ArrayList<Character> wordState = new ArrayList<>();  
         int wrongGuesses = 0;
         for(int i = 0; i < fruit.length(); i++) {
             wordState.add('_');
         }
         
         System.out.println("Welcome to Hangman!");
         System.out.println("___________________");



         while (wrongGuesses < 6 ) {
             System.out.println(getHangmanART((wrongGuesses)));
             System.out.print("Fruit: ");
             for (char c : wordState) {
                 System.out.print(c + " ");
             }
             System.out.println();
             System.out.print("Guess a letter: ");
             char guess = scanner.nextLine().toLowerCase().charAt(0);
             
             if (fruit.indexOf(guess) >= 0) {
                 System.out.println("Correct !!");
                 for (int i = 0; i < fruit.length(); i++) {
                     if (fruit.charAt(i) == guess) {
                         wordState.set(i, guess);
                     }
                 }
                 if(!wordState.contains('_')){
                     System.out.println(getHangmanART((wrongGuesses)));
                     System.out.println("YOU WIN!\nYou've guessed the fruit: " + fruit);
              
                     break;
                
                 }
             } else {
                 wrongGuesses++;         
                 System.out.println("Wrong guess! You have " + (6 - wrongGuesses) + " guesses left.");
             }
          
         }    
   if (wrongGuesses >= 6){
                 System.out.println(getHangmanART(wrongGuesses));
                 System.out.println("GAME OVER !");
                 System.out.println("The fruit was : " + fruit);
             }
         scanner.close();
        
    }



    static String getHangmanART(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    +---+
                    |   |
                        |
                        |
                        |
                        |
                    =========""";
            case 1 -> """
                    +---+
                    |   |
                    O   |
                        |
                        |
                        |
                    =========""";
            case 2 -> """
                    +---+
                    |   |
                    O   |
                    |   |
                        |
                        |
                    =========""";
            case 3 -> """
                     +---+
                     |   |
                     O   |
                    /|   |
                         |
                         |
                     =========""";
            case 4 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                         |
                         |
                     =========""";
            case 5 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    /    |
                         |
                     =========""";
            case 6 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    / \\  |
                         |
                     =========""";
            default -> "";
        };
    }
}
