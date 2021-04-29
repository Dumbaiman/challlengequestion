package com.example.comtassessment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner aiman =  new Scanner(System.in);
        int num1 = aiman.nextInt();
        int num2 = aiman.nextInt();

        for(int a = num1 + 1;a<num2; a++){
            System.out.println(a);
        }
    }

}
