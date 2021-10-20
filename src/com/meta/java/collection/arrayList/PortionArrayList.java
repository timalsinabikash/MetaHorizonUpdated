package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PortionArrayList {
    public static void main(String[] args) {
        List<String>  firstList = new ArrayList<>();

        firstList.add("This");
        firstList.add("is");
        firstList.add("in");
        firstList.add("the");
        firstList.add("first");
        firstList.add("list");
        System.out.println(firstList);

        List<String> secondList = new ArrayList<>(firstList.subList(1,4));
        System.out.println(secondList);






    }
}
