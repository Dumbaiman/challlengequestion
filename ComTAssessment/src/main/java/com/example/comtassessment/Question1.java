package com.example.comtassessment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Put in the values!");
        Scanner aiman = new Scanner(System.in);
        int num1 = aiman.nextInt();
        int num2 = aiman.nextInt();
        int num3 = aiman.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("the smallest number is " + num1);
        }else if (num2 < num3){
            System.out.println("the smallest number is " +  num2);
        }else{
        System.out.println("the smallest number is" + num3);
    }
}}
