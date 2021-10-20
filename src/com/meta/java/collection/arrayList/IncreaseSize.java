package com.meta.java.collection.arrayList;

import java.util.ArrayList;

public class IncreaseSize {
    public static void main(String[] args) {
//        Write a Java program to increase the size of an array list.

        ArrayList<String > laptopList = new ArrayList<>();
        System.out.println(laptopList.size());

        laptopList.add("Macbook");
        laptopList.add("Lenovo");
        laptopList.add("HP");
        laptopList.add("Chromebook");
        laptopList.add("Asus");
        laptopList.ensureCapacity(10);

        System.out.println(laptopList);
        System.out.println(laptopList.size());



    }
}
