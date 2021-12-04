package com.codingchallenge.repeatstring;

public class RepeatStrings {
        static String repeatNTimes(String s, int n) {
            StringBuilder repeat = new StringBuilder();
            for (int i = 0; i < n; i++) {
                repeat.append(s);
                System.out.println(repeat.append(s));
            }
            return repeat.toString();
        }
    public static void main (String args[]) {
        System.out.println(repeatNTimes("GBEMI",10));
    }
    }



