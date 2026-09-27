
//Timer = Classth that schedules tasks at specific times or periodically
//        Useful for : sending notifications ,scheduled updates , repetitive actions
//TimerTask = Represents the task that will be executed by the Timer
//             extend the TimerTask class to define the task
//             Create a subclass of TimerTask and @Override run()


import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args)  {
        //creating a timer
        //The Timer class acts as a background scheduler
        // It manages a background thread responsible for executing tasks at specific times or delays
        Timer timer = new Timer();

        //Creating a TimerTask
        // we need to implement the run method using an anonymous class
        //TimerTask is an "abstract" class representing the actual job you want to run.
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("hello world !");
                //to cancel the timer
                count --;
                if (count<0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        //to execute our task in 3 sec
        //3000 : the delay

        timer.schedule(task, 3000);

        //to schedule at a fixed rate /periodecally
        //1000 : the period
        timer.schedule(task, 0, 1000);






    }
}
