import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapElements {
    public static void main (String []args) {
        // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
        ArrayList<String> abcArray = new ArrayList<String>();
        abcArray.add("first");
        abcArray.add("second");
        abcArray.add("third");
        Collections.swap(abcArray,2,0);
        System.out.println(abcArray);
    }
}
