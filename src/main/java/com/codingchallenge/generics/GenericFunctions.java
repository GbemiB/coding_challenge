package com.codingchallenge.generics;

public class GenericFunctions {

        // A Generic method example
        static <T> void genericDisplay(T element){

            System.out.println(element. getClass().getName() + " = " + element);
        }
}
