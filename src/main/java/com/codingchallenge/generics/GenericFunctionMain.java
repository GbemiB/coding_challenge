package com.codingchallenge.generics;

import static com.codingchallenge.generics.GenericFunctions.genericDisplay;

public class GenericFunctionMain {
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}
