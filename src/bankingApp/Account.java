package bankingApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    protected double balance=0;
    protected String name;
    protected ArrayList<Transaction> transactions= new ArrayList<Transaction>();

    public Account(String name) {
        this.name = name;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    //still need to configure createDeposit method. only copied from createWithdraw method
    //so far
    void createDeposit(){
        Date date=new Date();
        String note="";
        double amount=0;
        Scanner input=new Scanner(System.in);

        try {

            System.out.println("Why are you making a deposit?");
            note =input.nextLine();
        }catch (Exception e){
            System.out.println("Let's try that again.");
            createDeposit();

        }
        try {
            System.out.println("How much is your deposit?");
            amount =input.nextDouble();
            if (amount==0){
                System.out.println("Amount must be more than zero.");
                createDeposit();
            }
        }catch (Exception e){
            System.out.println("Please enter a number for the amount");
            createDeposit();
        }
        Deposit deposit;
        if (this.transactions.size()==0){

            deposit= new Deposit(date,note,getTransactions().size(),amount);}
        else {
            int TransNumber=getTransactions().get(getTransactions().size()-1).getTransNumber()+1;
            deposit= new Deposit(date,note,TransNumber,amount);

            transactions.get(0);
        }
        this.balance+=deposit.amount;
        this.transactions.add(deposit);

        }


//  need to finish minusing withdraw from balance as long as balance doesn't go below zero

    void createWithdraw(){
        Date date=new Date();
        String note="";
        double amount=0;
        Withdraw withdraw;
        Scanner input=new Scanner(System.in);

        try {

            System.out.println("Why are you making a withdraw?");
            note =input.nextLine();
        }catch (Exception e){
            System.out.println("Let's try that again. Why are you making a withdraw? ");
            createWithdraw();
        }
        try {
            System.out.println("How much is your withdraw?");
            amount =input.nextDouble();
        }catch (Exception e){
            System.out.println("Please enter a number for the amount");
            createWithdraw();
        }
        if (this.balance<=amount){
            System.out.println("The withdraw exceeds the balance of your account");
            return;

        }
        if (this.transactions.size()==0){

            withdraw= new Withdraw(date,note,getTransactions().size(),amount);}
        else {
            int TransNumber=getTransactions().get(getTransactions().size()-1).getTransNumber()+1;
            withdraw= new Withdraw(date,note,getTransactions().get(getTransactions().size()-1).getTransNumber()+1,amount);

            transactions.get(0);
        }
        this.balance-= withdraw.amount;
        transactions.add(withdraw);
//  need to finish minusing withdraw from balance as long as balance doesn't go below zero

    }
}
