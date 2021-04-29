package com.example.simplejavalabs;

public class TestRectagle {
    public static double calculateArea(double length, double breadth) {
        System.out.println("Calculating an area of a rectangle with ");
        System.out.println("Length = " + length + "cm and breadth =" + breadth + "cm");
        boolean square = false;
        if(length == breadth){
            System.out.println("Square = " + square);
        }else{
            System.out.println("Square =  " + square);
        }




        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        double areaofRectangle = calculateArea(45.5, 60.7);
        System.out.println("Area of rectangle = " + areaofRectangle + "cm sq" );
        boolean square = false;

    }

}
