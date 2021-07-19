package com.codingchallenge.hackerrank;

import java.util.Scanner;

public class Helloworld {

        public static void main(String[] args) {
            try {
                String input = "Hello, World.";
                Scanner scan = new Scanner(System.in);
                String inputString = scan.nextLine();
                scan.close();
                System.out.println("Hello, World.");
                System.out.println(inputString);   //prints Hello, World. and then what you entered for the inputstring.
            } catch(Exception HelloEX){
                System.out.println("Enter valid input please!");
            }
        }
    }


