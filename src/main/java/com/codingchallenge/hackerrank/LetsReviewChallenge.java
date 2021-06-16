package com.codingchallenge.hackerrank;
import java.util.Scanner;

public class LetsReviewChallenge {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("please enter the value of N");
            int N = in.nextInt();

            System.out.println("Enter enter your string value");
            in.nextLine();

            for (int i = 0; i < N; i++) {
                String string = in.nextLine();
                char[] charArray = string.toCharArray();

                for (int j = 0; j < charArray.length; j++) {
                    if (j % 2 == 0) {
                        System.out.print(charArray[j]);
                    }
                }

                System.out.print(" ");

                for (int j = 0; j < charArray.length; j++) {
                    if (j % 2 != 0) {
                        System.out.print(charArray[j]);
                    }
                }

                System.out.println();
            }
        }
                catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

