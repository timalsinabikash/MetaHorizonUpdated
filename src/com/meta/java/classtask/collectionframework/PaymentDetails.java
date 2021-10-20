package com.meta.java.classtask.collectionframework;

public class PaymentDetails {

    private double amount;

    private int delayDate;

    private String year;
    private String month;


    public PaymentDetails(double amount, int delayDate, String year, String month) {
        this.delayDate =delayDate;

        this.amount = amount;

        this.year = year;

        this.month = month;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(int delayDate) {
        this.delayDate = delayDate;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public PaymentDetails() {
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "amount=" + amount +
                ", delayDate=" + delayDate +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
