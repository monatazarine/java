import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
      //Java Banking Program


      //declare the vars

        double balance =0;
        boolean isRunning = true;
        int choice ;
        while (isRunning){
            //display a menu
            System.out.println("________________");
            System.out.println("BANKING PROGRAM ");
            System.out.println("________________");
            System.out.println("1. Show Balance ");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw ");
            System.out.println("4. EXIT ");
            System.out.println("****************");


            // get and process users choice

            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();

                case 3 ->balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE ");

            }
        }

      // showBalance()

      // deposit()
      // withdraw()
      //exit mssg
        System.out.println("______________________________");
        System.out.println("Thank you! Have a nice day !!! ");
        System.out.println("______________________________");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited : ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("The amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance ){
            double amount;
            System.out.print("Enter an amount to be withdrawn : ");
            amount = scanner.nextDouble();
            if (amount > balance){
                System.out.println("INSUFFICIENT FUNDS !! ");
                return 0;
            }else if(amount < 0){
                System.out.println("The amount can't be negative");
                return 0;
            }else{
                return amount;
            }
        }



}
