import java.util.ArrayList;

public class SumAll {
    public static void main (String []args) {
        // - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
        int sum = 0;
        int[] myList = {3,4,5,6,7};
        for (int i:myList) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
