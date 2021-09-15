package com.meta.java.stringMethodHw;

import java.util.Scanner;
/*Write a program to find the length of the string using the inbuilt function.
*/

public class StringLength {
    public static void displayStringLength(){
        System.out.println("  ");
        System.out.println("Please enter a string to get a length of:");
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        System.out.println("The length of the entered string is: "+input.length());

    }
}
