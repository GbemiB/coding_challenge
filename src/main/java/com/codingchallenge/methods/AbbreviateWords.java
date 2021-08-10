package com.codingchallenge.methods;

public class AbbreviateWords {

        public static void main(String[] args) {
            String name = "Bello Gbemisola";
            String[] newArray = name.split(" ");
            // split name into array with index 0 ans 1, each initial is converted to upper case and the first character is picked
            String initial = newArray[0].toUpperCase().charAt(0) + "." + newArray[1].toUpperCase().charAt(0);
            System.out.println("These are the initial: " + initial);

        }
    }


