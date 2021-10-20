package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {
    public static void main(String[] args) {
//        Write a Java program to insert an element into the array list at the first position


        List<Integer> addElements = new ArrayList<>();

        addElements.add(1);


        addElements.add(0,12);


        System.out.println(addElements);
    }
}
