package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchList {
    public static void main(String[] args) {
        List<String > placeList= new ArrayList<>();
//        Write a Java program to search an element in a array list.

        placeList.add("Kathmandu");
        placeList.add("Pokhara");
        placeList.add("Bhairawa");
        placeList.add("Biratnagar");
        placeList.add("Dharan");

        System.out.println(  placeList.contains("Dharan"));
    }
}
