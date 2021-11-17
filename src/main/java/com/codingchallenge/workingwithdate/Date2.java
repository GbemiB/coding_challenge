package com.codingchallenge.workingwithdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Date2 {
    public static void main(String args[]){
        LocalDate date14 = LocalDate.now();
        System.out.println(date14);
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat dateExample = new SimpleDateFormat("YYYY/MM/dd");
        String myDate = dateExample.format(date);
        System.out.println(myDate);

        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date1 = DateFor.parse("09/09/1997");
            System.out.println("Date : " + date);
        }catch (ParseException e) {e.printStackTrace();

        }

        Date date3 = new Date();
        SimpleDateFormat myNewDate = new SimpleDateFormat("MM/dd/yyyy");
        String stringDate = myNewDate.format(date);
        System.out.println("Date Format with MM/dd/yyyy : "+stringDate);
        myNewDate = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        stringDate = myNewDate.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+stringDate);
        myNewDate = new SimpleDateFormat("dd MMMM yyyy");
        stringDate = myNewDate.format(date);
        System.out.println("Date Format with dd MMMM yyyy : "+stringDate);
        myNewDate = new SimpleDateFormat("dd MMMM yyyy zzzz");
        stringDate = myNewDate.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : "+stringDate);
        myNewDate = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        stringDate = myNewDate.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z :"+stringDate);

        // Instantiate a Date object
        Date date4 = new Date();
        // display time and date using toString()
        System.out.println(date4.toString());

        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        
    }
}





