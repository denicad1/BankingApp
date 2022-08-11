package bankingApp;

import java.util.Date;

public class Withdraw extends Transaction{
    private String type="Withdraw";

    public Withdraw(Date date, String note, int transNumber, double amount) {
        super(date,note,transNumber,amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
