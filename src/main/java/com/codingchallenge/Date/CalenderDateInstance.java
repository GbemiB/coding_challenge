package com.codingchallenge.Date;
import java.text.*;
import java.util.Calendar;
public class CalenderDateInstance {
    public static void main(String[] args) {
            //Initializing the date formatter
            DateFormat Date = DateFormat.getDateInstance();
             //Initializing Calender Object
            Calendar cal = Calendar.getInstance();
            //Displaying the actual date
            System.out.println("The original Date: "+ cal.getTime());
             //Using format() method for conversion
            String currentDate = Date.format(cal.getTime());
            System.out.println("Formatted Date: " + currentDate);
        }
    }

