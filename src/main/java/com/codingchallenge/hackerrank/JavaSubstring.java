package com.codingchallenge.hackerrank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the value of your string");
        String S = in.next();
        System.out.println("please enter the your start index");
        int start = in.nextInt();
        System.out.println("please enter the your end index");
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
