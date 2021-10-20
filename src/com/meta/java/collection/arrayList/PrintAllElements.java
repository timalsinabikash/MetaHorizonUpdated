package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PrintAllElements {
    public static void main(String[] args) {
//        Write a Java program to print all the elements of a ArrayList using the position of the elements.


        List<String> nameList = new ArrayList<>();


        nameList.add("Hari");
        nameList.add("Ram");
        nameList.add("Sita");
        nameList.add("Arjun");

        for(String p:nameList){
            System.out.println(p);
        }
    }
}
