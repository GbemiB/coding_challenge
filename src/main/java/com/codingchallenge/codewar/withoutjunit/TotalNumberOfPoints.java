package com.codingchallenge.codewar.withoutjunit;

import java.util.Arrays;

public class TotalNumberOfPoints {
    public static int points(String[] games) {
        return Arrays.stream(games).mapToInt(value -> {
            int x = value.charAt(0);
            int y = value.charAt(2);
            return x > y ? 3 : x == y ? 1 : 0;
        }).sum();
    }
}
