package com.meta.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class JoinList {
    public static void main(String[] args) {
//Write a Java program to join two array lists


        List<String> bikeType= new ArrayList<>();

        bikeType.add("Sports");
        bikeType.add("Cruiser");
        bikeType.add("Racing");
        bikeType.add("Dirt");

        System.out.println("BikeType ArrayList "+"\n"+ bikeType);


        List<String>  carType = new ArrayList<>();
        carType.add("Coupe");
        carType.add("Sedan");
        carType.add("Sports");
        carType.add("SuperCar");
        carType.add("HyperCar");
        System.out.println("CarType ArrayList "+"\n"+ carType);

      bikeType.addAll(carType);
        System.out.println("Merged Array list"+"\n"+bikeType);

    }
}
