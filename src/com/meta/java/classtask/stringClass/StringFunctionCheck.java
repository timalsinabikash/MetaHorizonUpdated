package com.meta.java.classtask.stringClass;

import java.util.Locale;

public class StringFunctionCheck {
    public static void main(String[] args) {
        String name= "Java Programming";
        System.out.println("Length of name"+name.length());
        System.out.println("Character at particular index"+name.charAt(11));

        for (int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }


        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));


    }
}
