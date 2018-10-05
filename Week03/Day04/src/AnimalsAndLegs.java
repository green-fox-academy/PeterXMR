import java.util.Scanner;

public class AnimalsAndLegs {
        public static void main(String[] args) {
            // Write a program that asks for two integers
            // The first represents the number of chickens the farmer has
            // The second represents the number of pigs owned by the farmer
            // It should print how many legs all the animals have
            System.out.println("Enter numbers of chickens:");
            Scanner chickensN = new Scanner(System.in);
            int chickens = chickensN.nextInt();
            System.out.println("Now enter number of pigs:");
            Scanner pigsN = new Scanner(System.in);
            int pigs = pigsN.nextInt();
            System.out.println("Total number of legs is: " + ((chickens*2) + (pigs*4)));
    }
}
