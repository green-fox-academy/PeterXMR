
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestForSum {
    public Sum fisrstSum = new Sum();
    int a;
    int b;

    @Test
    public void testSum() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        a = list.size();
        fisrstSum.getSum(list);

        assertEquals(60,fisrstSum.getSum(list));
    }
}
