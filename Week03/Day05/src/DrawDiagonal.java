import java.util.Scanner;

public class DrawDiagonal {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = "%%%%%%";
        System.out.println(b);

        for (int i = 0; i < a-2; i++) {
            String newone =("");
            for (int j = 0; j < a-i-2; j++) {
                newone =                 newone + "%";


            }

            newone =                 newone + " ";
            for (int j = 0; j < a-(a-i-1); j++) {
                newone =                 newone + "%";


            }

            System.out.println(newone);
        }
        System.out.println(b);
    }
}
