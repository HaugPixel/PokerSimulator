package test;

import main.Game.Card;
import main.Game.Deck;
import main.Game.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

public class GetTwoHandsTest {


    @Test
    void TwoHands(){
        try{
            Deck myDeck = new Deck();
            myDeck.shuffleDeck();
            Hand Hand1 = new Hand();
            Hand Hand2 = new Hand();
            Hand1.addCard(myDeck.getCard());
            Hand2.addCard(myDeck.getCard());
            Hand1.addCard(myDeck.getCard());
            Hand2.addCard(myDeck.getCard());

            System.out.println("SB: " + Hand1.getStartingHandString());
            System.out.println("BB: " + Hand2.getStartingHandString());


        }
        catch (Exception e){
            System.out.println("Exception Thrown");
        }
    }
}
