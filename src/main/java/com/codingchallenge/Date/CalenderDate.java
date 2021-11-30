package com.codingchallenge.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalenderDate {

    public static void main(String args[]) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse("12-12-1990");
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
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



        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString1 = "23 01 1997";
        String inputString2 = "27 04 1997";

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //correct
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date dateAvant = sdf2.parse("02/25/2012");
            Date dateApres = sdf2.parse("03/31/2012");

            long diff = dateApres.getTime() - dateAvant.getTime();
            long res = (diff / (1000*60*60*24));
            System.out.println("Number of days between the two dates is: "+res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
