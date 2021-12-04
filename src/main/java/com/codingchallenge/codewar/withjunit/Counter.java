package com.codingchallenge.codewar.withjunit;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // declare variable of size
        int sheepCount = 0;
        // iterate through the array
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            // check for true
            if (arrayOfSheeps[i] == true) {
                // add it to the count
                sheepCount++;
            }

        }
        return sheepCount;
    }
}
