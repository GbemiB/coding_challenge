package com.codingchallenge.hackerrank;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        try {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        }catch (Exception numbers){
            System.out.println("Please enter valid input!");
        }

    }
}

