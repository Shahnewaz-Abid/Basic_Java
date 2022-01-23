package Assignment_3;

import java.util.*;

// Find the max and min number from a given array

public class Problem_3 {
    public static void main(String args[]) {
        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);

        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

