package com.meta.java.collection.arrayList;

import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList<String > firstList = new ArrayList<>();
        firstList.add("This");
        firstList.add("is");
        firstList.add("what");
        firstList.add("This");
        firstList.add("have");

        System.out.println(firstList);
        ArrayList<String > secondList =(ArrayList<String>)firstList.clone();

        System.out.println(secondList);
    }
}
