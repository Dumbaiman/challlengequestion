package com.example.simplejavalabs;

public class TestRelational {
    public static void printRelationals(int a, int b){
        System.out.println("a == b = " +  (a == b ));
        System.out.println("a != b " + (a != b ));
        System.out.println("a > b = " + (a > b ));
        System.out.println("a < b " + (a > b ));
        System.out.println("b >= a " + (b >= a ));
        System.out.println("b <= a " + (b <= a ));
    }

    public static void main(String[] args) {
        printRelationals(10, 20);
        System.out.println(" ================== ");
        printRelationals(45, 28);
    }

}
