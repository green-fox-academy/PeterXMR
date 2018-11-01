import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

//  solving it with good old for loop
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get( i )%2  == 0) {
//                System.out.println( numbers.get( i ) );
//            }
//        }
        numbers.stream().filter(x -> x %2  == 0).forEach(System.out::println);
    }
}
