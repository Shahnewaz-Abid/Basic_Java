package Assignment_3;

import java.util.*;

// Write a program to generate random number from 1 to 10 but print by it's alphabetical version. suppose random number is 3.
// But it will print Three. Each time you will press enter, it will generate new random numbers from 1-10 and will show its alphabetical version.

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String readString;
            readString = sc.nextLine();
            double rand = Math.ceil(Math.random()* 10);
            int random = (int)rand;
            System.out.println(random);
            if(random == 1) {
                System.out.println("One");
            }
            else if (random == 2) {
                System.out.println("Two");
            }
            else if (random == 3) {
                System.out.println("Three");
            }
            else if (random == 4) {
                System.out.println("Four");
            }
            else if (random == 5) {
                System.out.println("Five");
            }
            else if (random == 6) {
                System.out.println("Six");
            }
            else if (random == 7) {
                System.out.println("Seven");
            }
            else if (random == 8) {
                System.out.println("Eight");
            }
            else if (random == 9) {
                System.out.println("Nine");
            }
            else if (random == 10) {
                System.out.println("Ten");
            }
        }
    }
}
