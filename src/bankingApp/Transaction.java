package bankingApp;

import java.util.Date;

public class Transaction {
    protected Date date;
    protected String note;
    protected int transNumber;
    protected double amount;

    public Transaction(Date date, String note, int transNumber, double amount) {
        this.date = date;
        this.note = note;
        this.transNumber = transNumber;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getTransNumber() {
        return transNumber;
    }

    public void setTransNumber(int transNumber) {
        this.transNumber = transNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
