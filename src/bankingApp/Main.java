package bankingApp;
import java.util.Date;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Main init = new Main();
        Account balance = new Account("my_account");
        Singleton.getInstance().addToArray(balance);
        init.init(balance);
    }

    private int initialInput(){
        int choice=0;
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Hello, Welcome to the Bank! \nPlease select an option below!\n" +
                    "1 for Withdraw, 2 for Deposit, and 3 for Balance\nTo create a new account, press 4. "+
                    "To list accounts, press 5. To switch to a different account, please press 6");
            choice=input.nextInt();
            if (choice>6 || choice<1){
                System.out.println("Your input needs to be either 1,2,3,4,5 or 6");
                initialInput();
            }
        }catch (Exception e){
            System.out.println("You need to select a number");
            initialInput();
        }
        return choice;
    }

    private void init(Account balance){
        Scanner input=new Scanner(System.in);
        Account selection=accountSelection();
        int choice=initialInput();
        if (choice == 1){
            balance.createWithdraw();
        } else if (choice==2) {
            balance.createDeposit();
        } else if (choice==3) {
            System.out.println("Your current balance is "+balance.getBalance());
        } else if (choice==4) {
            createAccount();
        } else if (choice==5) {
            getAccountNames();
        } else if (choice==6) {
            selection=accountSelection();
        }
        System.out.println("Is there anything else you would like to do? Enter Yes or No");
        String answer=input.nextLine();
        String simplified=answer.toLowerCase();
        if (simplified.equals("yes")) {

            init(selection);
        } else if (simplified.equals("no")) {
            return;
        }
        else {
            System.out.println("I didn't get that.");
            init(selection);
        }
    }
    private void createAccount(){
        Scanner input= new Scanner(System.in);
        String name="";
        try{
            System.out.println("Please enter the name for the account.");
            name=input.nextLine();
        }catch (Exception e){
            System.out.println("That name isn't acceptable. Please Try again");
            createAccount();
        }
        Account account=new Account(name.toLowerCase());
        Singleton.getInstance().addToArray(account);
    }
    private Account accountSelection(){
        Scanner input= new Scanner(System.in);
        System.out.println("Which account would you like to use?");
        String choice= input.nextLine();
        String lower=choice.toLowerCase();
        Account def=new Account("");
        for (Account account:Singleton.getInstance().getArray()) {
            System.out.println(account.getName());
            System.out.println(lower.equals(account.name));
            if (lower.equals(account.name)) {
                return account;
            }
        }
        System.out.println("I couldn't recognize that account.");
        accountSelection();
        return def;
    }
    private void getAccountNames(){
        for (Account account:Singleton.getInstance().getArray()) {
            System.out.println(account.getName());
        }
    }






}
