import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    String apple = ("Apple");

    public Apples apples = new Apples ();



    @Test
    public void appleTest () {
        this.apple = apple;

        apples.getapple();

        assertEquals("Apple",apples.getapple());
    }
}
