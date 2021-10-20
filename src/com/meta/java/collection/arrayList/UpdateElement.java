package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
    public static void main(String[] args) {
//        Write a Java program to update specific array element by given element.
        List <String> elementList = new ArrayList<>();


        elementList.add("Car");
        elementList.add("Bike");
        elementList.add("Cycle");
        elementList.add("Tanker");
        elementList.add("Trucker");

        System.out.println(elementList.get(3));

        elementList.set(3,"Helicopter");
        System.out.println(elementList.get(3));
    }
}
