package Assignment_2;

import java.util.*;

// Write a program to sum of digits of a number by taking from user input

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        while(n!=0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("sum of digit: "+sum);
    }
}