package com.meta.java.classandobjectshw.abstracthw.hw3;

import java.text.DecimalFormat;

public class StudentB extends Marks{


    private double marksA;
    private double marksB;
    private double marksC;
    private double marksD;

    public double getMarksA() {
        return marksA;
    }

    public void setMarksA(double marksA) {
        this.marksA = marksA;
    }

    public double getMarksB() {
        return marksB;
    }

    public void setMarksB(double marksB) {
        this.marksB = marksB;
    }

    public double getMarksC() {
        return marksC;
    }

    public void setMarksC(double marksC) {
        this.marksC = marksC;
    }

    public double getMarksD() {
        return marksD;
    }

    public void setMarksD(double marksD) {
        this.marksD = marksD;
    }

    public StudentB(double marksA, double marksB, double marksC, double marksD) {
        this.marksA = marksA;
        this.marksB = marksB;
        this.marksC = marksC;
        this.marksD = marksD;
    }

    @Override
    void getPercentage() {
        double percentage = (marksA+marksB+marksC+marksD)/4;
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The total percentage of Student B is "+  dc.format(percentage)+"% .");
    }
}
