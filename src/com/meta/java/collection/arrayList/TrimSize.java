package com.meta.java.collection.arrayList;

import java.util.ArrayList;

public class TrimSize {
    public static void main(String[] args) {
//        Write a Java program to trim the capacity of an array list the current list size.


        ArrayList<String > laptopList = new ArrayList<>(10);
        System.out.println(laptopList.size());

        laptopList.add("Macbook");
        laptopList.add("Lenovo");
        laptopList.add("HP");
        laptopList.add("Chromebook");
        laptopList.add("Asus");

        System.out.println(laptopList);
        laptopList.trimToSize();

        System.out.println(laptopList.size());
    }
}
