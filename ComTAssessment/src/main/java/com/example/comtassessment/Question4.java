package com.example.comtassessment;

import java.util.Scanner;

public class Question4 {
    Scanner aiman = new Scanner(System.in);
    static void calculationPrice(int num ) {
        int price = 1000;
        num = 6;
        int totalcost = num * price;
        System.out.println("The total cost of the ipads is "+ totalcost);
    }

    public static void main(String[] args) {
        calculationPrice(6);
    }

}