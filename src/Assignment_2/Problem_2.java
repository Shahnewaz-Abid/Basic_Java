package Assignment_2;

import java.util.*;

// Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to generate prime numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = 2;
        int number2 = scanner.nextInt();

        if (number1 >= number2) {
            System.out.println("Number2 must be greater then number1");
            System.exit(0);
        }
        while (number1 <= number2) {
            int i = 2, count = 0;
            while (i <= number1 / 2) {
                if (number1 % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0) {
                System.out.println(number1 + " is prime number");
            }
            number1++;
        }
    }
}
