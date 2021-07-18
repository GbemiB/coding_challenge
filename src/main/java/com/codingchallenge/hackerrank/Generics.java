package com.codingchallenge.hackerrank;

public class Generics {
    //printing all generic array in a line
    public static <E> void printArray(E[] generic){
        for(E element : generic) {
            System.out.println(element);
        }
    }
}
