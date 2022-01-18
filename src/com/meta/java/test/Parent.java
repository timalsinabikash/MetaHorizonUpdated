package com.meta.java.test;

import java.util.ArrayList;
import java.util.List;

public abstract class Parent {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(" ");
        list.add("B");
        list.add(" ");
        list.add("1");
        list.add("A");
        System.out.println(list.stream().filter(s -> s.equals(" ")).count());
    }
}
