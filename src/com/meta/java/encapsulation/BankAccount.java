package com.meta.java.encapsulation;

public class BankAccount {

    private String accountHolderName;
    private  String mobileNumber;
    private  String email;


    private double balance;
    private double overdraftAmount;





    public  BankAccount(String accountHolderName, String mobileNumber, String email, double balance, double overdraftAmount) {
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.balance = balance;
        this.overdraftAmount = overdraftAmount;
    }

    public BankAccount() {

    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber.length()==10) {
            this.mobileNumber = mobileNumber;
        }else {
            this.mobileNumber="9841432947";
            System.out.println("Invalid mobile number.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        if (overdraftAmount<1000){
            this.overdraftAmount = 1000;
        } else {
            this.overdraftAmount=overdraftAmount;
        }

    }
}
