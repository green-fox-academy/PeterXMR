package com.company;

import java.util.Scanner;

public class DivideByZero {
    public static void main (String [] args){
        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        try {
            int resut = 12 / divisor;
            System.out.println(resut);
        }catch (ArithmeticException firstOne) {
        System.out.println("Fail        .");
        }
    }
}
