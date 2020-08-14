package main.Game;
import java.lang.*;
import java.util.Comparator;
import java.util.Objects;


/**
 * Card data
 */
public class Card implements Comparator<Card> {
    private char sort;
    private int num;

    Card(){}

    public Card(char sort, int num) throws ValueException{
        if (!Deck.getSorts().contains(Character.toLowerCase(sort)))
            throw new ValueException("Not a sort");
        if (num > 13 || num < 1)
            throw new ValueException("Need to be a number between 1-13");
        this.sort = Character.toLowerCase((sort));
        this.num = num;
    }

    public char getSort() {
        return sort;
    }

    public int getNum() {
        if (num==1)
            return num+13;
        else
            return num;
    }

    public String getCardNameShort() {
        switch (this.num) {
            case 10:
                return "T" + sort;
            case 11:
                return "J" + sort;
            case 12:
                return "Q" + sort;
            case 13:
                return "K" + sort;
            case 1:
                return "A" + sort;
            default:
                return String.valueOf(num) + sort;
        }
    }
    public String getCardNameLong() {
        switch (this.num) {
            case 10:
                return "Ten of " + sort;
            case 11:
                return "Jack of " + sort;
            case 12:
                return "Queen of " + sort;
            case 13:
                return "King of" + sort;
            case 1:
                return "Ace of" + sort;
            default:
                return String.valueOf(num) + " of " + sort;
        }
    }

    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getNum(), o2.getNum());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return sort == card.sort &&
                num == card.num;
    }



}
