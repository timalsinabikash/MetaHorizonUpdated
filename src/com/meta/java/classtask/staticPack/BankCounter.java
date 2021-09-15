package com.meta.java.classtask.staticPack;

public class BankCounter {

    public String counterName;

    public static int count =1;
    public BankCounter(String counterName){
        this.counterName=counterName;
    }

    public void nextCount()
    {
        System.out.println("----------------");
        System.out.println(counterName);
        System.out.println("Current token number"+count++);
    }

    public static void main(String[] args) {
        BankCounter c1 = new BankCounter("Himalayan counter");
        BankCounter c2 = new BankCounter("Annapurna counter");
        BankCounter c3 = new BankCounter("Kanchanjanga counter");


    c1.nextCount();
    c2.nextCount();
    c1.nextCount();
    c2.nextCount();
    c2.nextCount();
    c3.nextCount();
    c3.nextCount();
    c1.nextCount();
    c3.nextCount();
    c2.nextCount();
    c1.nextCount();
    c1.nextCount();
    c2.nextCount();
    c3.nextCount();
    c2.nextCount();
    c3.nextCount();
    c1.nextCount();
    c3.nextCount();



    }










}
