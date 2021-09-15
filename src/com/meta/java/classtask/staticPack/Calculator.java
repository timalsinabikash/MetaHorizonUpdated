package com.meta.java.classtask.staticPack;

import java.util.Scanner;

public class Calculator {


    private static double firstNumber;
    private static double secondNumber;
    public static void readNumbers(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        firstNumber= sc.nextDouble();
        System.out.println("Enter second number");
        secondNumber= sc.nextDouble();




    }

    public void displayCalculatedData(){
        System.out.println("SUM "+(firstNumber+secondNumber));
        System.out.println("PRODUCT "+(firstNumber*secondNumber));
        System.out.println("DIFFERENCE "+(firstNumber-secondNumber));
    }
}
