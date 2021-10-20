package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class IsEmpty {
    public static void main(String[] args) {
        List<String > laptopList = new ArrayList<>();

        laptopList.add("Macbook");
        laptopList.add("Lenovo");
        laptopList.add("HP");
        laptopList.add("Chromebook");
        laptopList.add("Asus");

        System.out.println(laptopList);

        System.out.println(laptopList.isEmpty() ? "List is empty": "List is not empty");
    }
}
