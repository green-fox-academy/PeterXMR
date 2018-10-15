import java.util.Scanner;

public class CowsAndBulls {

    public void main() {
        int counter =0;
        System.out.println("Guess a 4 gidit number."
               +"Rules are: For every digit that you guessed correctly in the correct place, you have a “cow”."
               +"For every digit you guessed correctly in the wrong place is a “bull." );

        Scanner scan1 = new Scanner(System.in);
        CowsAndBulls CAB = new CowsAndBulls();
    }

    public void CAB(int Random, int counter, Scanner scan1) {
        //random 4 digit number, which is the goal to guess.
        Random = (int) (Math.random() * (9999));
        //state where the game state is stored (playing, finished).
        if (scan1.equals(Random)) {
            System.out.println("AWESOME, You Won!");
        } else {
            counter ++;
            System.out.println("No worries, its just your " + counter + " try again to guess a 4 gidit number.");
        }
        //The CAB object should have a counter where it counts the guesses.
        //The CAB object should have a guess method, which returns a string of the guess result

    }
}
