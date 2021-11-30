package com.codingchallenge.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderDatePractice {
    static void find(String join_date, String leave_date)
    {
        // Create an instance of the SimpleDateFormat class
        SimpleDateFormat obj = new SimpleDateFormat("YYYY-MM-DD");
        // In the try block, we will try to find the difference
        try {
            // Use parse method to get date object of both dates
            Date date1 = obj.parse(join_date);
            Date date2 = obj.parse(leave_date);
            // Calucalte time difference in milliseconds
            long time_difference = date2.getTime() - date1.getTime();
            // Calucalte time difference in days
            long days_difference = (time_difference / (1000*60*60*24)) % 365;
            // Calucalte time difference in years
            long years_difference = (time_difference / (1000l*60*60*24*365));
            // Calucalte time difference in seconds
            long seconds_difference = (time_difference / 1000)% 60;
            // Calucalte time difference in minutes
            long minutes_difference = (time_difference / (1000*60)) % 60;

            // Calucalte time difference in hours
            long hours_difference = (time_difference / (1000*60*60)) % 24;
            // Show difference in years, in days, hours, minutes, and seconds
            System.out.print(
                    "Difference "
                            + "between two dates is: ");
            System.out.println(
                    hours_difference
                            + " hours, "
                            + minutes_difference
                            + " minutes, "
                            + seconds_difference
                            + " seconds, "
                            + years_difference
                            + " years, "
                            + days_difference
                            + " days"
            );
        }
        // Catch parse exception
        catch (ParseException excep) {
            excep.printStackTrace();
        }
    }
    // Main class
    public static void main(String[] args)
    {
        // Set values for both dates

        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        String join = "2018-12-01";
        String leave  = "2018-12-03";
        // Calling find() method for getting difference bwtween dates
        find(date, leave);

        //String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        System.out.println(date);
    }



}
