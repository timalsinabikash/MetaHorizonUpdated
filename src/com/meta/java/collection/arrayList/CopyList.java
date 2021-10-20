package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
//        Write a Java program to copy one array list into another. Go to the editor
//Click me to see the solution
        List<String> firstList = new ArrayList<>();


        firstList.add("Hello");
        firstList.add("This");
        firstList.add("is");
        firstList.add("first");
        firstList.add("list");
        System.out.println(firstList);


        List<String> secondList =new ArrayList<>(firstList);

        System.out.println(secondList);
    }
}
