package com.account;

public class Account {
    private String numberOfAccount;
    private double balance;

    private Client client;

    private boolean debit;
    private Currency currency;

    public Account() {}

    public Account(String numberOfAccount, double balance, Client client, boolean debit, Currency currency) {
        this.numberOfAccount = numberOfAccount;
        this.balance = balance;
        this.client = client;
        this.debit = debit;
        this.currency = (currency != null) ? currency : Currency.PLN;
    }

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void payment(double amount, Currency currency) {
        if (currency == null) {
         currency = Currency.PLN;
        }

        if (this.currency != currency) {
            System.out.println("Nie można wpłacić: waluta konta różni się od wpłacanej waluty.");
        }

        this.balance += amount;
        System.out.println("Wpłacono: " + amount + " " + this.currency);
    }
    public void payOut(double amount) {
        if (this.debit || this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Wypłacono: " + amount + " " + this.currency);
        } else {
            System.out.println("Nie ma wystarczająco środków");
        }
    }
    public void checkBalance() {
        System.out.println("Saldo: " + this.balance + " " + this.currency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberOfAccount='" + numberOfAccount + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                ", debit=" + debit +
                ", currency=" + currency +
                '}';
    }
}
