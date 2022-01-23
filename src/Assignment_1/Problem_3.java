package Assignment_1;

import java.util.*;

// Write a program that takes a year from user and print whether that year is a leap year or not

public class Problem_3 {
    public static void main(String[] args) {
        int year;
        System.out.println("enter an year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Mention year is a leap year");
        }
        else
        {
            System.out.println("Mention year is not a leap year");
        }
    }
}