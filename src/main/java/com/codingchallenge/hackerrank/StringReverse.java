package com.codingchallenge.hackerrank;

import java.util.Objects;
import java.util.Scanner;

public class StringReverse {
        public  static String check(String A) {
            String R = new StringBuilder(A).reverse().toString();
            return Objects.equals(A, R) ? "YES" : "NO";

        }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER YOUR STRING TO CHECK FOR PALINDROME");
        Scanner sc=new Scanner(System.in);
                    String str =sc.next();
        System.out.println(check(str));

    }
}
