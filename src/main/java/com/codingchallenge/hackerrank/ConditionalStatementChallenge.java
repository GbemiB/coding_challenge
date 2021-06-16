package com.codingchallenge.hackerrank;

import java.util.Scanner;

public class ConditionalStatementChallenge {
    /* If n is odd, print Weird
If n is even and in the inclusive range of  2 to 5 print Not Weird
If n is even and in the inclusive range of  6 to 20 print Weird
If n is even and greater than 20 print Not Weird */
    public static void main(String[] args) {
        int n;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter your number ");
            n = input.nextInt();
            if (n % 2 == 0) {
                if (n >= 2 && n <= 5)
                    System.out.print("Not Weird");
                else if (n >= 6 && n <= 20)
                    System.out.print("Weird");
                else
                    System.out.print("Not Weird");    //learn try with resource
            } else if (n % 2 != 0)
                System.out.print("Weird");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



