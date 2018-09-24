package com.company;

import java.util.Scanner;

public class Summing {

    //  Create the usual class wrapper
//  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me, how manz numbers you would like to add: ");
        int numbers = scanner.nextInt();

        System.out.println("Sum of your numbers is: " + sum(numbers));
    }

    public static int sum(int lastNumber) {
        int[] sumArray = new int[lastNumber + 1];
        int sum = 0;
        for (int i = 0; i <= lastNumber; i++) {
            sumArray[i] = i;
            sum += sumArray[i];
        }
        return sum;
    }
}