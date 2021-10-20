package com.meta.java.encapsulation;

public class BankFunctions {
    BankAccount [] bankAccounts = new BankAccount[5];

    public void createBankAccount(String accountHolderName, String emailAddress, String mobileNumber, double initialBalance) {
        BankAccount newAccount;
        newAccount = new BankAccount();
        newAccount.setAccountHolderName(accountHolderName);
        newAccount.setEmail(emailAddress);
        newAccount.setMobileNumber(mobileNumber);
        newAccount.setBalance(initialBalance);
        newAccount.setOverdraftAmount(1000);

        int newIndex = getAvailableIndexofBankAccount();
        if(newIndex!=100){
            bankAccounts[newIndex]=newAccount;
            System.out.println("Bank Account created successfully.");
        } else {
            System.out.println("Bank account creating limit is exceeded!!!");
        }

    }


    public void displayAccountDetails (){
        for (BankAccount bankAccount:bankAccounts){
            if(bankAccount != null) {
                System.out.println("-----------------");
                System.out.println("Account Holder Name " + bankAccount.getAccountHolderName());
                System.out.println("Account Holder email " + bankAccount.getEmail());
                System.out.println("Account Holder mobileNumber " + bankAccount.getMobileNumber());
                System.out.println("Account Holder balance " + bankAccount.getBalance());
                System.out.println("-------------------");
            }
        }

    }


    public int getAvailableIndexofBankAccount(){
        for (int i=0; i<bankAccounts.length;i++){
            if (bankAccounts[i]==null){
                return i;
            }
        }
        return 100;
    }

    public double depositAmount(double depositAmount, String email, String mobileNumber) {
        int currentBankIndex=findBankAccountIndex(email,mobileNumber);



        if(currentBankIndex==100){
            System.out.println("Bank account didn't match");
            return 0;
        } else {

            bankAccounts[currentBankIndex].setBalance(bankAccounts[currentBankIndex].getBalance()+depositAmount);
        return bankAccounts[currentBankIndex].getBalance();
        }
    }

    public double withdrawAmount(double withdrawAmount, String email, String mobileNumber) {
        int currentBankIndex=findBankAccountIndex(email,mobileNumber);



        if(currentBankIndex==100){
            System.out.println("Bank account didn't match");
            return 0;
        }

         else {
             if (withdrawAmount<(bankAccounts[currentBankIndex].getBalance()+1000)){

                 bankAccounts[currentBankIndex].setBalance(bankAccounts[currentBankIndex].getBalance() - withdrawAmount);
                 return bankAccounts[currentBankIndex].getBalance();
             }else
             {
                 System.out.println("Insufficient funds!!");
                 return 0;
             }
            }

    }
    public int findBankAccountIndex(String email, String mobileNumber){
        int currentBankIndex=100;

        for (int i = 0; i < bankAccounts.length; i++) {
            if(bankAccounts[i]!=null) {
                if (bankAccounts[i].getMobileNumber().equals(mobileNumber) && bankAccounts[i].getEmail().equals(email)) {
                    currentBankIndex = i;
                    break;
                }
            }

        }
        return currentBankIndex;

    }

    public void individualAccountDetails(String email, String mobileNumber){
        int currentBankIndex=findBankAccountIndex(email,mobileNumber);
        if(currentBankIndex==100){
            System.out.println("Bank account didn't match");

        } else {
            System.out.println("-----------------");
            System.out.println("Account Holder Name " + bankAccounts[currentBankIndex].getAccountHolderName());
            System.out.println("Account Holder email " + bankAccounts[currentBankIndex].getEmail());
            System.out.println("Account Holder mobileNumber " + bankAccounts[currentBankIndex].getMobileNumber());
            System.out.println("Account Holder balance " + bankAccounts[currentBankIndex].getBalance());
            System.out.println("-------------------");
        }
    }

}

