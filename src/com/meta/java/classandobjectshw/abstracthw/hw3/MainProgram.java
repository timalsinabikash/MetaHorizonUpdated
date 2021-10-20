package com.meta.java.classandobjectshw.abstracthw.hw3;

public class MainProgram {
    public static void main(String[] args) {
        StudentA sa=new StudentA(80,90,95);
        sa.getPercentage();
        System.out.println("--------------");


        StudentB sb = new StudentB(90,30, 80,85);
        sb.getPercentage();
    }
}
