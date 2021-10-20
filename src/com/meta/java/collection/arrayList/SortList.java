package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
//        Write a Java program to sort a given array list.
        List<String> companyList = new ArrayList<>();

        companyList.add("Apple");
        companyList.add("IBM");
        companyList.add("Samsung");
        companyList.add("Microsoft");
        companyList.add("Amazon");


        System.out.println(companyList);
        Collections.sort(companyList);
        System.out.println(companyList);
    }
}
