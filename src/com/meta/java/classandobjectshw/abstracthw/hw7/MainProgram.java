package com.meta.java.classandobjectshw.abstracthw.hw7;


import java.util.Scanner;

public class MainProgram{
    public static void main(String[] args) {
        Area area = new Area();
        Scanner sc = new Scanner(System.in);




        for (int i = 0; i<5;i++){
            System.out.println("Please enter the radius of the Circle "+(i+1));
            int radius = sc.nextInt();
            area.CircleArea(radius);

        }

        for (int i = 0; i<4;i++){
            System.out.println("Please enter the side of the Square "+(i+1));
            int side = sc.nextInt();
            area.SquareArea(side);

        }
        for (int i = 0; i<4;i++){
            System.out.println("Please enter the length of the Rectangle "+(i+1));
            int length = sc.nextInt();
            System.out.println("Please enter the breadth of the Rectangle "+(i+1));
            int breadth = sc.nextInt();
            area.RectangleArea(length,breadth);

        }


    }
}
