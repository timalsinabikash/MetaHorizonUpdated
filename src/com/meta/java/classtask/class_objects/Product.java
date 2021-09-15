package com.meta.java.classtask.class_objects;

public class Product {

    public   String name;
    public String uniqueCode;
    public String brand;
    public double price;


    public void displayProduct(){
        System.out.println("Name"+name);
        System.out.println("UniqueCode"+uniqueCode);
        System.out.println("Brand"+brand);
        System.out.println("Price"+price);
    }
    public boolean checkIfProductPriceisHigherrThan(double samplePrice){
        return price > samplePrice;
    }

}
