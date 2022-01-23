package Assignment_1;

import java.util.*;

// Take three numbers from the user and print the greatest number

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a = input.nextInt();
        System.out.println("enter 2nd number: ");
        int b = input.nextInt();
        System.out.println("enter 3rd number: ");
        int c = input.nextInt();
        if(a > b && a > c){
            System.out.println("the greatest number is: " + a);
        }
        else if(b > a && b > c){
            System.out.println("the greatest number is: " + b);
        }
        else{
            System.out.println("the greatest number is: " + c);
        }
    }
}
