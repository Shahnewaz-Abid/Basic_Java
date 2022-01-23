package Assignment_1;

import java.util.*;

// Write a program to sum of random numbers

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double rand1 = Math.ceil(Math.random()*10);
        System.out.println((int)rand1);
        double rand2 = Math.ceil(Math.random()*10);
        System.out.println((int)rand2);
        sum+=(int)(rand1+rand2);
        System.out.println("guess the sum of two random numbers: ");
        int guess = sc.nextInt();
        if(guess == sum) {
            System.out.println("you are correct!");
        }
        else {
            System.out.println("you are wrong...");
        }
    }
}