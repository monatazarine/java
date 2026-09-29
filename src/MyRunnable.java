//The background task
//implements Runnable:MyRunnable contains a task that can be executed on a separate,independent thread of execution
public class MyRunnable implements Runnable{
    //Seconde thread
    @Override
    public void run(){
        //countdown clock :pauses the background thread for 1 sec on each loop iteration
        for (int i = 0; i <= 5; i++) {
            try {
                //the current thread : the main thread
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted !");;
            }
            if(i == 5){
                System.out.println("Time's up !");
                //to end the program
                System.exit(0);
            }


        }
    }
}
