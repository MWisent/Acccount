package com.account;

public class Account {
    private String numberOfAccount;
     private double balance;
    private boolean debit;


    public Account(String numberOfAccount, double balance, boolean debit) {
        this.numberOfAccount = numberOfAccount;
        this.balance = balance;
        this.debit = debit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
    }

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public void payment(double amount) {
        this.balance += amount;
    }
    public void payOut(double amount) {
        if (this.debit || this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Nie ma wystarczająco środków");
        }


    }
    public double checkAccount() {
        return this.balance;
    }
}
