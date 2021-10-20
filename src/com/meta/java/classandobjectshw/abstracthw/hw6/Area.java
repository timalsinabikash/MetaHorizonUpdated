package com.meta.java.classandobjectshw.abstracthw.hw6;

import java.text.DecimalFormat;

public class Area extends Shape{
    @Override
    public void RectangleArea(double length, double breadth) {

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The area of the rectangle is: "+df.format(length*breadth)+" m2");



    }

    @Override
    public void SquareArea(double side) {
        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println("The area of square is: "+df.format(side*side)+" m2");


    }

    @Override
    public void CircleArea(double radius) {
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The area of the circle is: "+ df.format(Math.PI*radius*radius));


    }
}
