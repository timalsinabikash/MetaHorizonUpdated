package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {
    public static void main(String[] args) {

//        Write a Java program to create a new array list,
//        add some colors (string) and print out the collection.
        List<String> colorList = new ArrayList<>();
        colorList.add("blue");
        colorList.add("red");
        colorList.add("white");
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("black");
        colorList.add("Matte Black");
        colorList.add("pink");
        colorList.add("grey");


        for (int i = 0; i < colorList.size(); i++) {
            String color = colorList.get(i);
            if (color.length() >= 5) {
                System.out.println(color);
            }
        }


    }
}

