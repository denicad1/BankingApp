package bankingApp;

import java.util.ArrayList;
import java.util.Objects;

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
}
