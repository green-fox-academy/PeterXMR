import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
     System.out.println("Here enter your Name:");
     Scanner scanner = new Scanner(System.in);
     String userInput1 = scanner.nextLine();
     System.out.println("Hello, " + userInput1 +".");
    }
}