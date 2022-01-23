package Assignment_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// Write a program to calculate difference between today and your birthday

public class Problem_1 {
    public static void main(String[] args) throws ParseException {
        String myBirthDate = "04/12/1997";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = formatter.parse(myBirthDate);
        Date date2 = new Date();
        long dis = date2.getTime() - date1.getTime();
        long year = (dis / (1000l * 60 * 60 * 24 * 365));
        long day = (dis / (1000 * 60 * 60 * 24)) % 365;
        long hour = (dis / (1000 * 60 * 60)) % 24;
        long minutes = (dis / (1000 * 60)) % 60;
        long second = (dis / 1000) % 60;

        System.out.println("Year: "+year);
        System.out.println("Day: "+day);
        System.out.println("Hours: "+hour);
        System.out.println("Minutes: "+minutes);
        System.out.println("Second: "+second);
    }
}
