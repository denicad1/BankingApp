package bankingApp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Main init=new Main();
        Account balance=new Account("My Account");

        balance.transactions.add(new Deposit(new Date(),"adf",12,500));
        init.init(balance);


// these if statements are going with the withdraw, deposit balance section


    }

    void init(Account balance){
        Scanner input=new Scanner(System.in);
        int choice=initialInput();

        if (choice == 1){
            balance.createWithdraw();
        } else if (choice==2) {
            balance.createDeposit();
        } else if (choice==3) {
            System.out.println("Your current balance is "+balance.getBalance());
        }

        System.out.println("Is there anything else you would like to do? Enter Yes or No");
        String answer=input.nextLine();
        String simplified=answer.toLowerCase();
        if (simplified.equals("yes")) {

            init(balance);
        } else if (simplified.equals("no")) {
            return;
        }
        else {
            System.out.println("I didn't get that.");
            init(balance);
        }
    }
    int initialInput(){
        int choice=0;
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Hello, Welcome to the Bank! \nPlease select an option below!\n" +
                    "1 for Withdraw, 2 for Deposit, and 3 for Balance");
            choice=input.nextInt();
            if (choice>3 || choice<1){
                System.out.println("Your input needs to be either 1,2 or 3");
                initialInput();
            }
        }catch (Exception e){
            System.out.println("You need to select a number");
            initialInput();
        }
        return choice;
    }



}
