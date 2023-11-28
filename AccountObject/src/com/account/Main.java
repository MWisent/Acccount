package com.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Address address = new Address("Białystok", "15-666", "Boboli", 65);
        Client client = new Client("Marcin", "Perko", 1990, "marcin@gmail.com", "333-333-333", address);
        Account account = new Account("1234567890", 2000.0, client, true, Currency.PLN);

//        System.out.println(address.toString());
//        System.out.println("----------");
//        System.out.println(client.toString());
//        System.out.println("----------");
//        System.out.println(account.toString());
//        System.out.println("----------");
        account.payment(2300.0, Currency.PLN);
        account.payOut(200.0);
        account.checkBalance();



    }
}
