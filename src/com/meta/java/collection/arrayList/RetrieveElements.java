package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElements {
    public static void main(String[] args) {
//Write a Java program to retrieve an element (at a specified index) from a given array list.

        List <String> nameList = new ArrayList<>();


        nameList.add("Hari");
        nameList.add("Ram");
        nameList.add("Sita");
        nameList.add("Arjun");


        System.out.println(nameList.get(2));

    }
}
