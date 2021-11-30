package com.codingchallenge.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] argv) throws ParseException {

    //1. Create a Date from String

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "2015-02-02";
    System.out.println(dateInString);


    Date date = sdf.parse(dateInString);
        System.out.println("=======" + date);



    DateAndCalendar obj = new DateAndCalendar();

    //2. Test - Convert Date to Calendar
    Calendar dateOfBirth = obj.dateToCalendar(date);
    System.out.println(dateOfBirth.getTime());
    Calendar currentDate = Calendar.getInstance();

        LocalDate dt = LocalDate.now();
        System.out.println("=======" + currentDate);


      long time_difference = date.getTime();
        Date time_difference3 = currentDate.getTime();

        if ((currentDate.get(Calendar.MONTH) == dateOfBirth.get(Calendar.MONTH)) &&
                (currentDate.get(Calendar.DAY_OF_MONTH) == (dateOfBirth.get(Calendar.DAY_OF_MONTH)))) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }


    //3. Test - Convert Calendar to Date
    Date newDate = obj.calendarToDate(dateOfBirth);
    System.out.println("=======" + newDate);



}

    //Convert Date to Calendar
    private Calendar dateToCalendar(Date date) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;

    }

    //Convert Calendar to Date
    private Date calendarToDate(Calendar calendar) {
        return calendar.getTime();
    }

}
