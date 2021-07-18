package com.codingchallenge.generics;

public class main {
        public static void main (String[] args) {
            // instance of Integer type
            Book<Integer> iObj = new Book<Integer>(15);
            System.out.println(iObj.getObject());

            // instance of String type
            Book<String> sObj = new Book<String>("List of Gbemisola's books");
            System.out.println(sObj.getObject());

        }
    }

