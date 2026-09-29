import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{
    private final LocalTime alarmTime;
    private  final  String path;
    private  final Scanner scanner ;
    AlarmClock(LocalTime alarmTime,String path,Scanner scanner){
        this.alarmTime = alarmTime;
        this.path = path;
        this.scanner = scanner;
    }
    @Override
    public void  run(){

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                System.out.printf("\rCurrent Time: %02d:%02d:%02d" ,now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted !");
                break;
            }
        }
             System.out.println("\n Alarm ringing! Time is : " + alarmTime);
             alarmSound(path);
    }
    private void alarmSound(String path){
        File audioFile = new File(path);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile) ) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press *Enter* to stop the alarm!");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e){
                  System.out.println("Unsupported audio file format ");          
             }
        catch(LineUnavailableException e){
            System.out.println("Audio line unavailable");
        }
        catch (IOException e){
            System.out.println("Error playing audio" );
        }


    }
}
