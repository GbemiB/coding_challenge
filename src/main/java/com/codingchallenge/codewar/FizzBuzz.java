package com.codingchallenge.codewar;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number ");
            int number = input.nextInt();
            if ((number % 5 == 0) && (number % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(" ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



    /* public static void main(String[] args) {  //repeating string value n number of time
        repeat("hello", 10);
    }
    public static void repeat(String val, int n ){
        System.out.println(val.repeat(n));
    } */



    /* public static void main(String[] args) {
        repeat("hello", 10); }
    public static void repeat(String val, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(val);
        }
        System.out.println("String is :" + builder.toString());
        //System.out.println("String is :" + builder.reverse()); //to reverse the string and repeat 10 times
        }
    } */


     /*   public static void main(String[] args) {
       String string = "hello";
        int count = 10;
        System.out.println("String :" + string.repeat(count));
        }
     } */





