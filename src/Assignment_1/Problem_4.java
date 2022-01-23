package Assignment_1;

import java.util.*;

// Write a program to check if inputted letter is small or capital

public class Problem_4 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character: ");
        ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z') {
            System.out.println(ch+" is an upper case letter");
        }
        else if(ch>='a' && ch<='z') {
            System.out.println(ch+" is a lower case letter");
        }
        else {
            System.out.println(ch+" is not a alphabets");
        }
    }
}
