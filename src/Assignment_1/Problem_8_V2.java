package Assignment_1;

import java.util.*;

// Write a program to check balance and withdraw money from ATM booth using switch case

public class Problem_8_V2 {
    public static void main(String[] args) {

        int balance = 10000, withdraw;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Check Balance");
            System.out.println("Choose 3 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Current Balance : "+balance);
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 3:

                    System.exit(0);
            }
        }
    }
}
