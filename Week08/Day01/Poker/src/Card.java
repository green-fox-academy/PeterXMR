import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    public static List<Character> value = new ArrayList<>( Arrays.asList('2', '3', '4', '5', '6', '7', '8', '9', 'T','J', 'Q', 'K', 'A' ));
    public List<Character> colors = new ArrayList<>(Arrays.asList('C', 'D', 'H', 'S'));
    String card;

    public Card () {
        this.card = value.get((int)(Math.random()*value.size())).toString() + colors.get((int)(Math.random()*colors.size())).toString();
    }

    public Card (Character value, Character colors) {
    card = value.toString()+colors.toString();
    }

    public String toString() {
        return card;
    }
}
