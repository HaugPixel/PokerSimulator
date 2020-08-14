package main.Game;


import java.util.*;


/**
 * Deck of cards
 */
public class Deck {
    Stack<Card> myDeck;
    private static Character[] sorts = {'s','h','c','d'};


    /**
     * Creates Deck of 52 cards | 4 sorts * 13 values
     * @throws ValueException if sort or number is wrong
     */
    public Deck() throws ValueException {
        this.myDeck = new Stack<>();
        for (int i = 1; i < 14; i++) {
            for (Character cha: sorts){
                myDeck.push(new Card(cha,i));
            }

        }
    }

    public void shuffleDeck(){
        Collections.shuffle(myDeck);
    }

    public void burnCard(){
        myDeck.pop();
    }

    public Card getCard(){
        return myDeck.pop();
    }


    public Card peekCard(){
        return myDeck.peek();
    }
    public static List<Character> getSorts(){
        return Arrays.asList(sorts);
    }
}
