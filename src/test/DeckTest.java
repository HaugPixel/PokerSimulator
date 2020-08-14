package test;

import main.Game.Card;
import main.Game.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;


public class DeckTest {
    Deck myDeck;

    @BeforeEach
    private void makeDeck(){
        try {
            myDeck = new Deck();
            myDeck.shuffleDeck();

        }
        catch (Exception e){
            System.out.println("Exception Thrown");
        }
    }

    @Test
    void assertDifferentCards(){
        Card card1 = myDeck.getCard();
        Card card2 = myDeck.getCard();

        System.out.println(card1.getCardNameShort() + card2.getCardNameShort());

        assertNotSame(card1, card2);

        }
    @Test
    void makeHand(){

    }
    @Test
    void getFlop(){

    }


}
