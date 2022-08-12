package bankingApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Account {
    protected double balance=0;
    protected String name;
    protected ArrayList<Objects> transactions= new ArrayList<Objects>();

    public Account(String name) {
        this.name = name;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    //still need to configure createDeposit method. only copied from createWithdraw method
    //so far
    double createDeposit(){
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
        Withdraw withdraw= new Withdraw(date,note,this.transactions.size(),amount);
//  need to finish minusing withdraw from balance as long as balance doesn't go below zero
        return withdraw;
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
        Withdraw withdraw= new Withdraw(date,note,this.transactions.size(),amount);
//  need to finish minusing withdraw from balance as long as balance doesn't go below zero
        return withdraw;
    }
}
