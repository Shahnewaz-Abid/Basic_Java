package Assignment_1;

import java.util.Scanner;

// Write a program to get a number from the user and print whether it is positive or negative.

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num >= 0) {
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }
    }
}