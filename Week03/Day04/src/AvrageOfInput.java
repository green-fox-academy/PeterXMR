import java.util.Scanner;

public class AvrageOfInput {
    public static void main (String []args){
        System.out.println("Type 5 nimbers for sum here:");
        Scanner scanner1 = new Scanner(System.in);
        int one = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int two = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        int three = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        int four = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int five = scanner5.nextInt();

        int sum = one + two + three + four +five;
        double average = sum / 5;
        System.out.println("Sum: " +sum + ", Average: " + average);

    }
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
}