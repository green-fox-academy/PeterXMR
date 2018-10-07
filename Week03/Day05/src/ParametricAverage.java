import java.util.Scanner;

public class ParametricAverage {
    public static void main (String[]args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
        System.out.println("Type for numbers.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int d = scanner3.nextInt();
        int count = a+b+c+d;
        double average = count/4;
        System.out.println("Sum: " + count +", Average" + average);
    }
}
