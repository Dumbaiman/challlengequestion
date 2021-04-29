package com.example.simplejavalabs;

import java.util.Scanner;

import jdk.nashorn.internal.ir.LexicalContext;

public class TestMarks {
    public static void main(String[] args) {
        double marks;
        System.out.println("Give me your marks!");
        Scanner aiman = new Scanner(System.in);
        marks = aiman.nextDouble();
        if(marks<50){
            System.out.println("you have failed");
        }else if(marks<60){
            System.out.println("you scored a D ");
        }else if(marks<70){
            System.out.println("you scored a C LOL!");
        }else if(marks<80){
            System.out.println("you scored a B");
        }else {
            System.out.println("you scored a A wah so smart!");
        }

    }
}