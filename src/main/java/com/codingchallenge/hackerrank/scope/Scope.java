package com.codingchallenge.hackerrank.scope;

import java.util.Arrays;

public class Scope {

        int[] elements;
        int maximumDifference;
        int[] a;

        void Difference ( int[] a){
            this.elements = a;

        }

        void computeDifference () {
            Arrays.sort(elements);
            maximumDifference = Math.abs(elements[(elements.length - 1)] - elements[0]);
        }

    }

