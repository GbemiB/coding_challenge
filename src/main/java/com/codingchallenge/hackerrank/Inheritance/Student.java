package com.codingchallenge.hackerrank.Inheritance;

import java.util.Scanner;

class Student extends Person {
        private String firstName;
        private String lastName;
        private int idNumber;
        private int[] testScores;
        int sum = 0;
        int a = 0;


        public Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.testScores = testScores;
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = id;
        }

        //method


        public char calculate() {

             for (int i = 0; i < testScores.length; i++) {
                 a = a + testScores[i];
             }

             a = a / testScores.length;


             if (90 <= a && a <= 100) {
                 return 'O';
             } else if (80 <= a && a < 90) {
                 return 'E';
             } else if (70 <= a && a < 80) {
                 return 'A';
             } else if (55 <= a && a < 70) {
                 return 'P';
             } else if (40 <= a && a < 55) {
                 return 'D';
             } else if (0 <= a && a < 40) {
                 return 'T';
             } else {
                 return Character.MIN_VALUE;
             }


        }

}





