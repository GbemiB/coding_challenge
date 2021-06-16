package com.codingchallenge.hackerrank;

public class RecursiveFactorialChallenge {

        /*
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         *
         */

        public static int factorial(int n) {
            // Write your code here
            if (n==0 || n==1)
            {
                return 1;
            }
            else
            {
                return n*factorial(n-1);
            }

        }
    }

