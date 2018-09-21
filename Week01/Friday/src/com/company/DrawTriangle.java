package com.company;

import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number here");
        int a = scanner.nextInt();

        for (int b = 1; b<=a; b++) {
            int c=0;
            while (c<b) {
                System.out.print("*");
                c++;
            }
            System.out.println();
        }
    }
}
