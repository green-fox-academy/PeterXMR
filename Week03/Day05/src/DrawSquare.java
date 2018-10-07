import java.util.Scanner;

public class DrawSquare {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (scanner.nextInt());
        System.out.println("%%%%%%");
        for (int i = 0; i < a - 2; i++) {
            System.out.println("%    %");
        }
        System.out.println("%%%%%%");
    }
}
