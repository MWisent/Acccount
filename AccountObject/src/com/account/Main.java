package com.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("\nPodaj numer rachunku: ");
        String numberOfAccount = sc.nextLine();

        System.out.print("Podaj stan konta: ");
        double balance = sc.nextDouble();

        System.out.print("Czy masz konto debetowe (true/false): ");
        boolean debit = sc.nextBoolean();

        Account client = new Account(numberOfAccount, balance, debit);
        // Wyświetl stan konta przed operacją
        System.out.println(client.checkAccount());

        client.payment(300.0);
        client.payOut(400.0);

        //Wyświetl stan konta po operacji
        System.out.println("Stan konta po operacji: " + client.getBalance());

        // Dodatkowe informacje
        System.out.println("Numer rachunku: " + client.getNumberOfAccount());
        // Czy jest debet
        System.out.println("Numer rachunku: " + client.isDebit());





    }
}
