import java.util.Scanner;

public class PrintBigger {
    public static  void main (String [] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Type two numbers here.");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();

        if  (a > b) {
            System.out.println("This number is bigger: " + a);
        }
        else {
            System.out.println("This number is bigger: " + b);
        }
    }
}