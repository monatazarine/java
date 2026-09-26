import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "pizza" ;

        Scanner scanner = new Scanner(System.in);
         ArrayList<Character> wordState = new ArrayList<>();  
         int wrongGuesses = 0;
         for(int i = 0; i < word.length(); i++) {
             wordState.add('_');
         }
         
         System.out.println("Welcome to Hangman!");
         System.out.println("___________________");



         while (wrongGuesses < 6 ) {
             System.out.println(getHangmanART((wrongGuesses)));
             System.out.print("Word: ");
             for (char c : wordState) {
                 System.out.print(c + " ");
             }
             System.out.println();
             System.out.print("Guess a letter: ");
             char guess = scanner.nextLine().toLowerCase().charAt(0);
             
             if (word.indexOf(guess) >= 0) {
                 System.out.println("Correct !!");
                 for (int i = 0; i < word.length(); i++) {
                     if (word.charAt(i) == guess) {
                         wordState.set(i, guess);
                     }
                 }
                 if(!wordState.contains('_')){
                     System.out.println(getHangmanART((wrongGuesses)));
                     System.out.println("YOU WIN!\nYou've guessed the word: " + word);
              
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
                 System.out.println("The word was : " + word);
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
