import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Enter value of MIles-");
        Scanner scanner = new Scanner(System.in);
        float miles = scanner.nextInt();
        double kilometers =  miles * 1.60934;
        System.out.println(miles + " miles is: " + kilometers + " kilometers. ");

    }
}