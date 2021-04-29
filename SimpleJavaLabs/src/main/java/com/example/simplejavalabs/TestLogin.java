package com.example.simplejavalabs;

import java.util.Scanner;

public class TestLogin {

    public static void main(String[] args) {
      boolean login =  false;
      String password = "Dumbaiman123";
      System.out.println("Enter password:  ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      if (input.equals(password)){
          login = true;
          System.out.println("welcome to the jungle! = " + login );
      }
      else{
          System.out.println("You are not authorised! = " + login );
      }





    }

}