package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {
    public static void main(String[] args) {
        //Write a Java program to empty an array list
        List<String > laptopList = new ArrayList<>();

        laptopList.add("Macbook");
        laptopList.add("Lenovo");
        laptopList.add("HP");
        laptopList.add("Chromebook");
        laptopList.add("Asus");

        System.out.println(laptopList);


        laptopList.removeAll(laptopList);
        System.out.println(laptopList);
    }
}
