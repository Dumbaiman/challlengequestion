package com.example.comtassessment;

import java.util.Scanner;

public class Question3 {
    Scanner aiman = new Scanner(System.in);
    public static void main(String[] args) {
        int[] value = {55, 24, 65, 41, 13, 22, 76 , 90};
        for(int a = 0;a<value.length;a++) {
            if (value[a] >= 55) {

                System.out.println(value[a]);
            }
        }
    }



}
