package com.meta.java.stringMethodHw;

import java.util.Scanner;
/*Write a program to take string input with space.*/

public class InputWithSpace {

    public static void getStringWithSpace (){
        System.out.println("Please enter a string with space in it:");
        Scanner sc = new Scanner(System.in);
        System.out.println("The string is: "+sc.nextLine());
    }
}
