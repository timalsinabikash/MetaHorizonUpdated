package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
    public static void main(String[] args) {
//        Write a Java program of swap two elements in an array list.
        List<String> carType= new ArrayList<>();

        carType.add("Coupe");
        carType.add("Sedan");
        carType.add("Sports");
        carType.add("SuperCar");
        carType.add("HyperCar");


        System.out.println(carType);





        Collections.swap(carType,1,3);
        System.out.println(carType);
    }
}
