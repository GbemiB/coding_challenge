package com.codingchallenge.methods;

public class ComparingStrings {

        public static void main(String[] var0) {
            String var1 = "Gbemi";
            String var2 = "GBEMI";
            if (var1.equals(var2)) {
                System.out.println("User credential is valid, go to home page");
            } else {
                System.out.println("Invalid credential, remain in login");
            }

        }
    }

