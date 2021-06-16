package com.codingchallenge.hackerrank;

import java.util.Scanner;

public class OperatorChallenge {
    public static void main(String[] args) {
        double mealCost;
        int tipPercent;
        int taxPercent;

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("please enter your basic mealCost ");
            mealCost = input.nextDouble();
            System.out.print("please enter your tip percent ");
            tipPercent = input.nextInt();
            System.out.print("please enter your  tax percent ");
            taxPercent = input.nextInt();
            double tipValue = mealCost * tipPercent / 100.00;
            double taxValue = mealCost * taxPercent / 100.00;
            int totalMealCost = (int) Math.round(mealCost + tipValue + taxValue);
            System.out.print("Your total meal cost is " + totalMealCost + " naria " + "please pay to the cashier ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



