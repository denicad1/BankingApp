package bankingApp;

import java.util.Date;

public class Deposit extends Transaction{
        private String type="Deposit";

    public Deposit(Date date, String note, int transNumber, double amount, String type) {
        super(date, note, transNumber, amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
