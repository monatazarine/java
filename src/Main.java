//How to work with Dates & Times
//(LocalDate, LocaleTime , LocalDateTime)

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args)  {

        LocalDate date = LocalDate.now();
        //date = today's date

        LocalTime time = LocalTime.now();
        //time = the current time
        System.out.println(time);

        //both the date & time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        //Custom format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);

        //Custom date obj
        LocalDateTime dateTime2 = LocalDateTime.of(2023 ,4,17 ,6,50,32);
        System.out.println(dateTime2);

        //to compare dates
        if(dateTime2.isBefore(dateTime1)){
            System.out.println(dateTime2 + " is earlier than "+ dateTime1);

        } else if (dateTime2.isAfter(dateTime1)) {
            System.out.println(dateTime2 + " is later than "+ dateTime1);
        }
        else if (dateTime2.isEqual(dateTime1)){
            System.out.println(dateTime2 + " is equal "+ dateTime1);

        }

    }
}
