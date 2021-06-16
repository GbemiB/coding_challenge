package com.codingchallenge.hackerrank;

import java.util.Scanner;

import static java.util.Scanner.*;

public class LoopChallenge {
    int number;

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number ");
            int number = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println("number  x  i  = " + number * i);
            }

       }catch(Exception e){
            System.out.println(e.getMessage());
        e.printStackTrace();
       }
    }
}

