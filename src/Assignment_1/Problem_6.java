package Assignment_1;

import java.util.*;

// Write a program to check if the provided user credentials are valid during login

public class Problem_6 {
    public static void main(String[] args) {
        String s_username = "shahnewaz abid";
        String s_password = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter username: ");
        String username = sc.nextLine();
        System.out.println("enter password: ");
        String password = sc.nextLine();

        if(username.equals(s_username) && password.equals(s_password)) {
            System.out.println("access granted!");
        }
        else {
            System.out.println("access denied");
        }
    }
}