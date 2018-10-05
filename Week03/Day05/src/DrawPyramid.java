import java.util.Scanner;

public class DrawPyramid {
    public static void main (String []args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-10");
        int a = scanner.nextInt();

        for (int i = 0; i <a ; i++) {
            for (int k = 0; k < a; k++) {
                if (k>i) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <a ; j++) {
                System.out.print(" ");
                if (j<=i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
