package com.codingchallenge.codewar.withjunit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {
    public static String reverseWords(String str){

        List<String> sentence = Arrays.asList(str.split(" "));
        Collections.reverse(sentence);
        return sentence.stream().collect(Collectors.joining(" "));
    }
    public static void main (String args[]) {
        System.out.println(ReverseWord.reverseWords("GLEAMS THRG"));
    }
}
