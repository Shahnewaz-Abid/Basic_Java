package Assignment_2;

import java.util.Scanner;

// Create a math quiz program.
//Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
// If user inputs the correct summation, print "Answer is correct" and user will get 1 point.
// If user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int score = 0;
        for(int i = 1; i<=5; i++) {
            double rand1 = Math.ceil(Math.random()*10);
            System.out.println((int)rand1);
            double rand2 = Math.ceil(Math.random()*10);
            System.out.println((int)rand2);
            sum =(int)(rand1+rand2);
            System.out.println("guess the sum of two random numbers: ");
            int guess = sc.nextInt();
            if(guess == sum) {
                score++;
                System.out.println("Answer is correct!");
            }
            else {
                System.out.println("Answer is wrong...");
            }
        }

        System.out.println("Your total point: "+ score);
    }
}