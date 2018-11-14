import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Card> hand = new ArrayList<>();
    public String name;

    public Player(String name) {
        this.name = name;
        for (int i = 0; i < 5; i++) {
            this.hand.add(new Card());
        }
    }

    public Player(String name, String fiveCards) {
        this.name = name;
        hand = cardsInHand(fiveCards);
    }

    private List<Card> cardsInHand(String fiveCards){
        String[] cards = fiveCards.split(" ");
        for (int i = 0; i < cards.length; i++) {
            hand.add(new Card(cards[i].charAt(0),
                    cards[i].charAt(1)));
        }
        return hand;
    }
}