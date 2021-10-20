package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
//        Write a Java program to compare two array lists.
        List<String> firstList = new ArrayList<>();
        firstList.add("We");
        firstList.add("are");
        firstList.add("now");
        firstList.add("comparing");
        firstList.add("list");


        List<String> secondList = new ArrayList<>();
        secondList.add("we");
        secondList.add("are");
        secondList.add("now");
        secondList.add("not");
        secondList.add("comparing");


        System.out.println(firstList.equals(secondList));





    }
}
