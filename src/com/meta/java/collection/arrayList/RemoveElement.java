package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List <String> carList = new ArrayList<>();

//        Write a Java program to remove the third element from a array list.

        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Toyota");
        carList.add("Tesla");
        carList.add("Hyundai");

        System.out.println(carList.get(3));

        carList.remove(3);
        System.out.println(carList.get(3));
    }
}
