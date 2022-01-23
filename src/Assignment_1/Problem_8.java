package Assignment_1;

import java.util.*;

// Write a program to check balance and withdraw money from ATM booth using if else

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("current balance: "+balance);
        System.out.println("withdrawAmount: ");
        int withdrawAmount = sc.nextInt();
        if(balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("please collect your money & collect your card");
            System.out.println("current balance: "+balance);
        }
        else {
            System.out.println("Sorry! Insufficient money");
        }
    }
}