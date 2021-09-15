package com.meta.java.classtask.staticPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutOfMemory {
    static List<String > nameList=new ArrayList<>();

    public static void main(String[] args) {
        for (int i =0; i <=100; i++){
            Random random = new Random();
            nameList.add(String.valueOf(random.nextInt()));
        }
        System.out.println(nameList);
    }
}
