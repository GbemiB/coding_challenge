package com.codingchallenge.hackerrank;

import java.util.Scanner;

public class StringChallenge {
    public static void main(String[] args) {
        int i, i1;
        double d, d1;
        String s, s1;

        i = 2;
        d = 4;
        s = "Bello";

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first name ");
            s1 = input.nextLine(); // extra line
            System.out.print("Enter i1 value ");
            i1 = input.nextInt();
            System.out.print("Enter d2 value ");
            d1 = input.nextDouble();
            input.close();

            String name = s + " " + s1;
            int age = i + i1;
            double noOfEggs = d + d1;

            System.out.println("My name is " + name);
            System.out.println("My age is " + age);
            System.out.println("I love to eat " + noOfEggs + " everyday!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}




