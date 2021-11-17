package com.codingchallenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCheck {

    public static void main(String args[]) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("12-12-1990");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(date);


        Calendar currentDate = Calendar.getInstance();
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1996, 9 , 23);
        System.out.println("currentDate :" + currentDate.getTime());
        System.out.println("dateOfBirth :" + dateOfBirth.getTime());

        if((currentDate.get(Calendar.MONTH) == dateOfBirth.get(Calendar.MONTH)) &&
                (currentDate.get(Calendar.DAY_OF_MONTH)== (dateOfBirth.get(Calendar.DAY_OF_MONTH))))
        {
            System.out.println("HAPPY BIRTHDAY");
        }
        else{
            System.out.println("NOT YOUR BIRTHDAY YET ");
        }
    }
}
