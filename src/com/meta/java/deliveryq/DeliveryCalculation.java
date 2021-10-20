package com.meta.java.deliveryq;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DeliveryCalculation {


    double distance = 0;

    public static void main(String[] args) {


        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(-1);
        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2);

        List<List<Integer>> data = new ArrayList<>();
        data.add(l2);
        data.add(l1);
        data.add(l3);
        System.out.println(data);

        double distanceCalculation1 = 0;
        double distanceCalculation2 = 0;
        double distanceCalculation3 = 0;

        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        distanceCalculation1 =Double.parseDouble( decimalFormat.format(Math.sqrt(Math.pow(l1.get(0), 2) + Math.pow(l1.get(1), 2))));
        decimalFormat.format(distanceCalculation1);
        System.out.println("Distance of l1: " + distanceCalculation1 + l1);
        distanceCalculation2 = Double.parseDouble( decimalFormat.format(Math.sqrt(Math.pow(l2.get(0), 2) + Math.pow(l2.get(1), 2))));

        System.out.println("Distance of l2: " + distanceCalculation2 + l2);
        distanceCalculation3 = Double.parseDouble(decimalFormat.format(Math.sqrt(Math.pow(l3.get(0), 2) + Math.pow(l3.get(1), 2))));

        System.out.println("Distance of l3: " + distanceCalculation3 + l3);
        if (distanceCalculation1 < distanceCalculation2 && distanceCalculation1 < distanceCalculation3) {
            data.clear();
            data.add(0, l1);
            if (distanceCalculation2 < distanceCalculation3) {
                data.add(1, l2);
                data.add(2, l3);
            } else if (distanceCalculation3 < distanceCalculation2) {
                data.add(1, l3);
                data.add(2, l2);
            }
        } else if (distanceCalculation2 < distanceCalculation3 && distanceCalculation2 < distanceCalculation1) {
            data.clear();
            data.add(0, l2);
            if (distanceCalculation1 < distanceCalculation3) {
                data.add(1, l1);
                data.add(2, l3);
            } else if (distanceCalculation3 < distanceCalculation1) {
                data.add(1, l3);
                data.add(2, l1);
            }
        } else if (distanceCalculation3 < distanceCalculation1 && distanceCalculation3 < distanceCalculation2) {
            data.clear();
            data.add(0, l3);
            if (distanceCalculation1 < distanceCalculation2) {
                data.add(1, l1);
                data.add(2, l2);
            } else if (distanceCalculation2 < distanceCalculation1) {
                data.add(1, l2);
                data.add(2, l1);
            }

        }

        System.out.println(data);
    }

}

