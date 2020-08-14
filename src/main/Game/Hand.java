package main.Game;
import java.util.*;

public class Hand {
    List<Card> hand = new ArrayList<>();

    public Hand(Card card1, Card card2){
        if (card1 != null) {
            this.hand.add(card1);
        }
        if (card2 != null) {
            this.hand.add(card2);
        }
    }

    public Hand(){ }

    public String getStartingHandString() throws ValueException {
        List<Card> startingHand = new ArrayList<>();
        startingHand.add(hand.get(0));
        startingHand.add(hand.get(1));
        startingHand.sort(new Card());
        Card first = startingHand.get(1);
        Card second = startingHand.get(0);
        String defString = first.getCardNameShort().substring(0,1)+ second.getCardNameShort().substring(0,1);

        if (second.getSort()==first.getSort())
            return defString + "s";
        else if (second.getNum()==first.getNum())
            return defString;
        else
            return defString + "o";
    }
    public List<Card> getHand(){
        return this.hand;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }
}
