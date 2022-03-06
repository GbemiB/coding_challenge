package com.codingchallenge.codewar.withoutjunit;

public class RepeatString {
    public static String smash(String... words) {
        // String.join() method takes in delimiter i.e the character linking the arrays of string
        // in the sentence to be created. and the second thing it takes is the array of string
        String sentence = String.join(" " , words);
//        String sentence = String.join("_" , words);
//        String sentence = String.join("+" , words);
        return sentence;
    }
    public static void main (String args[]) {
        System.out.println(smash("MY", "NAME", "IS", "GBEMISOLA", "BELLO"));
    }
}
