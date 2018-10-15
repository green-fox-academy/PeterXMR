
import java.util.ArrayList;
import java.util.List;


public class Sum {
    int sumOfElements;
    int i;


    public int getSum (ArrayList<Integer> toBeSummedUp){
        int sum = 0;
        for (int i: toBeSummedUp) {
            sum += i;
        }
        return sum;
        }
}
