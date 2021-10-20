package com.meta.java.classandobjectshw.abstracthw.hw4;

public abstract class AbstractClass {
    public AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    public static void nonMethod(){
        System.out.println("This is a normal method of abstract class.");
    }
}
