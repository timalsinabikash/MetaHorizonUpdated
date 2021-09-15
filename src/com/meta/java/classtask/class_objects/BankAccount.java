package com.meta.java.classtask.class_objects;
/*create a class named BankAccount , add three state account holder name ,  account number , balance.
create a method called depositAmount that takes parameter double amount and add it to balance
create a method withdraw and deduct it from balance

 */

public class BankAccount {
    public String acHolderName;
    public int accountNumber;
    public double balance;


    public double depositAmount(double amount) {
        return (this.balance = this.balance + amount);

    }

    public double withdraw(double amount) {
        return (this.balance = this.balance - amount);
    }

    public void accountDetails() {
        System.out.println("Account Holder Name:" + this.acHolderName);
        System.out.println("Account Number:" + this.accountNumber);
        System.out.println("Balance: Rs" + this.balance);

    }


}












































