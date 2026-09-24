//Music player

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "src\\KarmaPolice.wavP";
        File file = new File(filePath);
         //AudioSystem.getAudioInputStream(file): Converts the file into a readable audio stream.
        try (Scanner scanner = new Scanner(System.in) ;AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


            //clip is like a music player that allows to load an audio file and then play ,pause or reset it
            Clip clip = AudioSystem.getClip();
            //to open the audio stream obj
            clip.open(audioStream); //Loads the raw audio stream into memory so it's ready to play instantly.

            //to play the audio
            //clip.start();

            String response= "";
            while (!response.equals("Q")){
                System.out.println("__Menu__");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("Q = Quit");
                System.out.println("_________");
                System.out.print("Enter your Choice : ");

                response = scanner.nextLine().toUpperCase();
                switch ( response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "Q" -> clip.close();
                    default -> System.out.println("INVALID CHOICE !!");


                }

            }


        }catch (FileNotFoundException e ){
            System.out.println("Unable to find file location !!");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported !");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch (IOException e) {
            System.out.println("Something went wrong !!");
        }
        finally {
            System.out.println("Done!");

        }
    }
}
