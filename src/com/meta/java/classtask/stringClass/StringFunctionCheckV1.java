package com.meta.java.classtask.stringClass;

public class StringFunctionCheckV1 {
    public static void main(String[] args) {
       /* String text = "suraj-bikash-aryan-ceeta-buddhiman-aryan-mukesh-tulasa";
        System.out.println(text);
        System.out.println(text.length());
        String[] splittedNames = text.split("-");
        System.out.println("Total length:"+ splittedNames.length);
        for (int i =0; i<splittedNames.length;i++) {
            System.out.println(splittedNames[i]);
        }*/


        String sampleString="Java Codes";
        System.out.println(sampleString.equalsIgnoreCase("Java CodeS"));
        System.out.println(sampleString.equals("Java CodeS"));
        System.out.println(sampleString.contains("Java"));
        System.out.println(sampleString.substring(3,7));


        String t1 = "    apple    cat";
        System.out.println(t1.trim());
        System.out.println(t1);

        String t2= "  apple cat    ";
        System.out.println(t2.replace(" ","$"));

    }
}
