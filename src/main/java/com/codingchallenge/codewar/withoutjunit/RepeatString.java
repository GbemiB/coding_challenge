package com.codingchallenge.codewar.withoutjunit;

public class RepeatString {
    public static String repeat(String str, int n) {
        // n is the number to times you want the string to be repeated
        String repeat = str.repeat(n);
        return repeat;
    }
    public static void main (String args[]) {
        System.out.println(repeat("GLEAMS", 10));
    }
}
