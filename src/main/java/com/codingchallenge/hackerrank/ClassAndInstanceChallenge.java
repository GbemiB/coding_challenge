package com.codingchallenge.hackerrank;

public class ClassAndInstanceChallenge {

        public class Person {                        //no main method to run
            private int age;

            public Person(int initialAge) {
                // Add some more code to run some checks on initialAge
                if (initialAge > 0) {
                    age = initialAge;
                } else {
                    System.out.println("Age is not valid, setting age to 0.");
                    age = 0;
                }

            }

            public void amIOld() {
                // Write code determining if this person's age is old and print the correct statement:
                if (age < 13) System.out.println("You are young.");
                else if (age < 18) System.out.println("You are a teenager.");
                else System.out.println(/*Insert correct print statement here*/"You are old.");
            }

            public void yearPasses() {
                // Increment this person's age.
                age++;
            }
        }
    }

