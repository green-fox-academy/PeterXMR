import java.awt.*;
import java.util.*;
import java.util.List;

public class PokerHand {
//Black 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH

    static int getIndex(Card card) {
        return Card.value.indexOf(card.toString().charAt(0));
    }

    static String highCard10 ( Player ... players) {

            String winningCondition = "High card: High card ace";
            for (int i = 4; i >= 0; i--) {
                int playerA = getIndex(players[0].hand.get(i));
                int playerB = getIndex(players[1].hand.get(i));
                if (playerA != playerB) {
                    return (playerA > playerB ? players[0].name : players[1].name) + "Wins! - (" + winningCondition + ")";
                }
            }
            return "Tie.";
        }
}
