package com.meta.java.stringMethodHw;

import java.util.Scanner;

public class StringLengthNoFunction {



    public static void isLengthOfString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to get a length:");
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            length++;
        }
        System.out.println(length);

    }
}
