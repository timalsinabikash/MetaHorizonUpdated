package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {

    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();

//        Write a Java program to shuffle elements in a array list
        integersList.add(5);
        integersList.add(3);
        integersList.add(2);
        integersList.add(45);
        integersList.add(4);
        integersList.add(54);
        integersList.add(23);

        System.out.println(integersList);

        Collections.shuffle(integersList);
        System.out.println(integersList);

    }
}
