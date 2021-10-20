package com.meta.java.encapsulation;

import java.io.IOException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        BankReaderClass brc = new BankReaderClass();
        BankFunctions bankFunctions = new BankFunctions();
        double depositAmount;
        String email;
        String mobileNumber;
        double finalAccountAmount;
        double withdrawAmount;


        while (isRunning){
            System.out.println("***********************************");
        System.out.println("1 CREATE ACCOUNT");
        System.out.println("2 DISPLAY ACCOUNT DETAILS");
        System.out.println("3 DEPOSIT");
        System.out.println("4 WITHDRAW");
        System.out.println("5 CHECK BALANCE");
        System.out.println("6 EXIT");
            System.out.println("-- ENTER YOUR CHOICE --");
        int choice= sc.nextInt();


        switch (choice) {
            case 1:
                BankAccount bankAccount = brc.readNewAccountDetails();
                bankFunctions.createBankAccount(bankAccount.getAccountHolderName(),bankAccount.getEmail(),bankAccount.getMobileNumber(),bankAccount.getBalance());
                break;
            case 2:
                bankFunctions.displayAccountDetails();
                break;
            case 3:
                //This section is for deposit


                 depositAmount=Double.parseDouble(brc.readDataFromUser("Enter amount to deposit"));
                 email= brc.readDataFromUser("Enter your email address");
                 mobileNumber= brc.readDataFromUser("Enter your account mobile number");

                 finalAccountAmount=    bankFunctions.depositAmount(depositAmount,email,mobileNumber);
                if(finalAccountAmount !=0){
                    System.out.println("Amount deposited successfully!! \nYour new balance is "+ finalAccountAmount);
                }
                break;
            case 4:
                //This section is for withdraw


                 withdrawAmount=Double.parseDouble(brc.readDataFromUser("Enter amount to withdraw"));
                 email= brc.readDataFromUser("Enter your email address");
                 mobileNumber= brc.readDataFromUser("Enter your account mobile number");
                finalAccountAmount=    bankFunctions.withdrawAmount(withdrawAmount,email,mobileNumber);
                if(finalAccountAmount !=0){
                    System.out.println("Amount withdrawn successfully!! \nYour new balance is "+ finalAccountAmount);
                }


                break;
            case 5:
                // This section to show the single account details
                System.out.println("Please enter the details below to get your account info");
                email= brc.readDataFromUser("Enter your email address");
                mobileNumber= brc.readDataFromUser("Enter your account mobile number");
                bankFunctions.individualAccountDetails(email,mobileNumber);

                break;
            case 6:
                isRunning= false;
                break;
            default:
                System.out.println("Invalid input,please try again.");
        }

    }
}}
