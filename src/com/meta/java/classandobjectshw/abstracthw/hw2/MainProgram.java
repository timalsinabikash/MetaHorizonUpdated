package com.meta.java.classandobjectshw.abstracthw.hw2;

public class MainProgram {
    public static void main(String[] args) {
        BankA ba = new BankA();
        ba.getBalance();
        System.out.println("**************");
        BankB bb= new BankB();
        bb.getBalance();
        System.out.println("***************");
        BankC bc = new BankC();
        bc.getBalance();
    }


}
