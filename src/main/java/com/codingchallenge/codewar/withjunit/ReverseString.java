package com.codingchallenge.codewar.withjunit;

public class ReverseString {
    public static String solution(String str) {
        String repeat = str.repeat(10);
        System.out.println(repeat);
        return new StringBuffer(str).reverse().toString();

    }

    public static void main (String args[]) {
        System.out.println(solution("GLEAMS"));
    }
}
