package Assignment_2;

import java.util.*;

// Write a program to make a digital tasbih where the program counts each time user press enter until press 0

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readString;
        int count = 0;
        while (true){
            readString = sc.nextLine();
            if(readString.equals("0")) {
                break;
            }
            count++;
            System.out.println("count: " + count);
        }
    }
}
