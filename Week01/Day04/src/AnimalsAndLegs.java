import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Plase enter number of chickens owned by you: ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Plase enter numbers of pigs owned by you: ");

        int chickens = scanner1.nextInt();
        int pigs = scanner2.nextInt();
        System.out.println( 2*chickens + 4*pigs);


        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}