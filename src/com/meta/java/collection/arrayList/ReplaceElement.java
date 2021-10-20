package com.meta.java.collection.arrayList;

import java.util.ArrayList;

public class ReplaceElement
{
    public static void main(String[] args) {



//        Write a Java program to replace the second element of a ArrayList with the specified element.


        ArrayList<String > laptopList = new ArrayList<>();

        laptopList.add("Macbook");
        laptopList.add("Lenovo");
        laptopList.add("HP");
        laptopList.add("Chromebook");
        laptopList.add("Asus");


        System.out.println(laptopList);

        laptopList.add(1,"None");

        System.out.println(laptopList);
    }
}
