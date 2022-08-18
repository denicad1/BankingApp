package bankingApp;

import java.util.ArrayList;

public class Singleton {
    private static Singleton mInstance;
    private ArrayList<Account> accounts = null;

    public static Singleton getInstance() {
        if(mInstance == null)
            mInstance = new Singleton();

        return mInstance;
    }

    private Singleton() {
        accounts = new ArrayList<Account>();
    }
    // retrieve array from anywhere
    public ArrayList<Account> getArray() {
        return this.accounts;
    }
    //Add element to array
    public void addToArray(Account account) {
        accounts.add(account);
    }
}
