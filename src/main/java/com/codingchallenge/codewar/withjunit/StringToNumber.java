package com.codingchallenge.codewar.withjunit;

public class StringToNumber {
        //TODO: Convert str into a number
        public static int stringToNumber(String str) {
            //  int number = Integer.parseInt(str);
            int number = Integer.valueOf(str);
            return number;
    }
    public static void main (String args[]) {
        System.out.println(stringToNumber("123445"));
    }
}
