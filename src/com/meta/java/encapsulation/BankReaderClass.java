package com.meta.java.encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankReaderClass {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public BankAccount readNewAccountDetails() throws IOException {
        BankAccount bankAccount= new BankAccount();
        System.out.println("Enter your name");
        bankAccount.setAccountHolderName(bufferedReader.readLine());

        System.out.println("Enter your email address");
        bankAccount.setEmail(bufferedReader.readLine());


         System.out.println("Enter your mobile number");
        bankAccount.setMobileNumber(bufferedReader.readLine());

        System.out.println("Enter your account opening balance");
        bankAccount.setBalance(Double.parseDouble(bufferedReader.readLine()));

        return bankAccount;


    }


    public String readDataFromUser(String message) throws IOException {
        System.out.println(message);
        return bufferedReader.readLine();
    }
}
