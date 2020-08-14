package test;
import static org.junit.jupiter.api.Assertions.*;

import main.Game.Card;
import main.Game.Deck;
import main.Game.Hand;
import main.Game.ValueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HandTest {
    @Test
    void makeHand() throws ValueException {
        Card card1 = new Card('h', 12);
        Card card2 = new Card('h', 1);
        Hand hand = new Hand(card1, card2);
        assertEquals("AQs", hand.getStartingHandString());
        card1 = new Card('h', 1);
        card2 = new Card('s', 2);
        hand = new Hand(card1, card2);
        assertEquals("A2o", hand.getStartingHandString());
        card1 = new Card('h', 8);
        card2 = new Card('s', 8);
        hand = new Hand(card1, card2);
        assertEquals("88", hand.getStartingHandString());
    }


}
