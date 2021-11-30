package com.codingchallenge.codewar;

public class SomeMethods {
        public static void main (String[] args){

            int myFirstNumber = (2*2) + (3*8);
            int mySecondNumber = 12;
            int myThirdNumber = (23 * 34);
            int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
            int myLastOne = 1000 - myTotal;
            System.out.println("My first Number is :" + myFirstNumber);
            System.out.println("My total number is "+ myTotal);
            System.out.println("My Last number is " + myLastOne);

            int myValue = 1000;
            int myMinIntValue = Integer.MIN_VALUE;
            int myMaxIntValue = Integer.MAX_VALUE;
            char myUnicodeChar = '\u0044';
            char myCopyrightChar = '\u00A9';
            System.out.println("Integer Minimum value = " + myMinIntValue);
            System.out.println("Integer Maximum value = " + myMaxIntValue);
            System.out.println("My UnicodeChar = " + myUnicodeChar);
            System.out.println("My CopyrightChar = " + myCopyrightChar);
            // casting means converting one data type to another

            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got the high score!");}
            int secondScore = 81;
            if ((topScore > secondScore) && (topScore < 100)) {
                System.out.println("Greater than second top score and less than 100");
            }
            if ((topScore > 90) || (secondScore <= 90)){
                System.out.println("Either or both of the conditions are true");
            }

            boolean isCar = false;
            if (!isCar) {    //means isCar is not equal to true
                System.out.println("This is not suppose to happen");
            }
            int ageOfClient = 20;
            boolean isEighteenOrOver = ageOfClient == 20? true : false; //ternary operators: it check of the condition is true and picks the 2nd and if its not true it picks the 3rd
            {
                System.out.println("what is your take: " + isEighteenOrOver);
            }

            double firstNumber = 20.00;
            double secondNumber = 80.00;
            double additionOfNumbers = (firstNumber + secondNumber) * 100.00;
            double remainderValue = additionOfNumbers % 40.00d;
            System.out.println("What is the remainder value " + remainderValue);
            boolean value = (remainderValue == 0)? true : false;
            System.out.println("Is the remainder value equals to  " + value);
            if ( remainderValue != 0.00) {
                System.out.println("Got some remainder");
            }
            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonous = 100;

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonous);
                finalScore += 1000;
                System.out.println("Your final score was " + finalScore);
            }

            score = 10000;
            levelCompleted = 8;
            bonous = 200;
            if (gameOver) {
                int finalScore = score + (levelCompleted * bonous);
                System.out.println("Your final score was " + finalScore);
            }


            int checkNumber;
            int checkNumber2;
            checkNumber= 45;
            checkNumber2 = 91;

            if (checkNumber > 55) {
                System.out.println("Condition not relevant! " +
                        "please use a relevant condition ");
            } else {
                if (checkNumber < 55) {
                    System.out.println("Condition is not relevant.");
                }
                if ((checkNumber2 < 55 )|| (checkNumber2 < 80) || (checkNumber2 > 90) ){
                    System.out.println("Number 2 is considered as a relevant number");

                }
            }

            int minutes;
            int seconds;
            int hours;
            double remainingMinutes;
            minutes = 60;
            seconds = 150;

            if ((minutes < 0) || (seconds < 0) || (seconds > 59)) ;
            System.out.println("Invalid value");


        }
    }




