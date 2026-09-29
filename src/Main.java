import java.util.Scanner;

//threading = allows a program to run multiple tasks simultaneously
//            helps improve performance with time-consuming operations
//            (File I/O , network communication , or any background tasks)
//Creating a thread:
//Op1 : Extending the Thread class
//Op2 : Implement the Runnable interface
public class Main {
    public static void main(String[] args)  {

        //The main thread
        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        //Damon thread auto-dies when the main thread is over
        thread.setDaemon(true);

        thread.start();
        System.out.println("You have 5 sec to enter your name : ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();



    }
}
