package com.meta.java.classandobjectshw.abstracthw.hw3;

import java.text.DecimalFormat;

public class StudentA extends Marks{
    private double marksA;
    private double marksB;
    private double marksC;




    public double getMarksC() {
        return marksC;
    }

    public void setMarksC(double marksC) {
        this.marksC = marksC;
    }

    public double getMarksB() {
        return marksB;
    }

    public void setMarksB(double marksB) {
        this.marksB = marksB;
    }

    public double getMarksA() {
        return marksA;
    }

    public void setMarksA(double marksA) {
        this.marksA = marksA;
    }



    public StudentA(double marksA, double marksB, double marksC) {
        this.marksA = marksA;
        this.marksB = marksB;
        this.marksC = marksC;
    }

    void getPercentage() {
        double percentage = (marksA+marksB+marksC)/3;
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The total percentage of Student A is "+  dc.format(percentage)+"% .");

    }
}
