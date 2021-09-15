package com.meta.java.classtask.class_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) throws IOException {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Please enter following numbers: \n1.To create account \n2.To make a deposit \n3.To make a withdraw \n4.To view account details \n5.To exit ");

            int userInput = sc.nextInt();
            if (userInput == 5) {
                break;
            }
            sc.nextLine();
            switch (userInput) {
                case 1:
                    System.out.println("Please enter account holder name:");


                    bankAccount.acHolderName= sc.nextLine();
                   // bankAccount.acHolderName = bf.readLine();


                    System.out.println("Please enter account Number of your choice:");
                    bankAccount.accountNumber = sc.nextInt();
                    System.out.println("  ");
                    break;


                case 2:
                    System.out.println("Please enter the amount to deposit");
                    double Input = sc.nextDouble();
                    while (Input <= 0) {
                        System.out.println("Please enter the valid value");
                        Input = sc.nextDouble();
                        if (Input > 0) {

                            break;
                        }
                    }
                    bankAccount.depositAmount(Input);
                    System.out.println("  ");
                    break;
                case 3:
                    if (bankAccount.balance <= 0) {
                        System.out.println("Please select other options since your account balance is " + bankAccount.balance);
                        System.out.println(" ");
                    } else {
                        System.out.println("Please enter the amount to withdraw");
                        double withdraw = sc.nextDouble();
                        while (withdraw > bankAccount.balance) {
                            System.out.println("Please enter the valid value");
                            withdraw = sc.nextDouble();
                            if (withdraw < bankAccount.balance) {

                                break;
                            }
                        }
                        bankAccount.withdraw(withdraw);
                        System.out.println("  ");
                    }

                    break;

                case 4:
                    bankAccount.accountDetails();
                    System.out.println("  ");
                    break;


                default:
                    break;


            }

            // bankAccount.accountDetails();
        }
    }
}
