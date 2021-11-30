package com.codingchallenge.codewar;

import java.util.Objects;

public class ComparingStrings {

        public static void main(String[] var0) {
            String var1 = "Gbemi";
            String var2 = "GBEMI";

            if(Objects.equals(var1,var2)){
                System.out.println("User credential is valid, go to home page");
            }
            else {
                System.out.println("Invalid credential, remain in login");
            }
        }
    }

