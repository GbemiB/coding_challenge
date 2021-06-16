package com.codingchallenge;

public class AbbrivateWords {

        public static void main(String[] args) {
            String name = "Bello Gbemisola";
            String[] newArray = name.split(" ");
            // split name into array with index 0 ans 1, each initails is converted to upper case and the first character is picked
            String initails = newArray[0].toUpperCase().charAt(0) + "." + newArray[1].toUpperCase().charAt(0);
            System.out.println("These are the initails: " + initails);

        }
    }


