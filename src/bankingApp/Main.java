package bankingApp;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
public class Main {
    Account balance=new Account("My Account");
    public static void main(String[] args) {
    Main init=new Main();


//    init.init();
    int choice= init.initialInput();
// these if statements are going with the withdraw, deposit balance section
    if (choice == 1){

    }


    }

    void init(){
        initialInput();
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
    double createWithdraw(){
        Date date=new Date();
        String note="";
        double amount=0;
        Scanner input=new Scanner(System.in);

        try {

            System.out.println("Why are you making a withdraw?");
            note =input.nextLine();
        }catch (Exception e){
            System.out.println("Let's try that again. Why are you making a withdraw? ");
        }
        try {
            System.out.println("How much is your withdraw?");
            amount =input.nextDouble();
        }catch (Exception e){
            System.out.println("Please enter a number for the amount");
        }
        Withdraw withdraw= new Withdraw(date,note,balance.transactions.size(),amount);
        balance.balance-=
//  need to finish minusing withdraw from balance as long as balance doesn't go below zero
    }


}
