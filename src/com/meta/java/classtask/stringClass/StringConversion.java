package com.meta.java.classtask.stringClass;

public class StringConversion {
    public static void main(String[] args) {

        String text = "apple";
        System.out.println(convertToUppercase(text));

    }

    public static String convertToUppercase(String text){
        String upperCaseString="";
        for (int i =0; i<text.length();i++) {
            int charAscii = text.charAt(i);
            charAscii = charAscii - 32;
            upperCaseString = upperCaseString + (char) charAscii;
        }
        return upperCaseString;


        }


    }

