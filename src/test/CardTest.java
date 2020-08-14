package test;
import static org.junit.jupiter.api.Assertions.*;

import main.Game.Card;
import main.Game.ValueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CardTest {

    @Test
    void makeCard(){
        try {
            Card myCard = new Card('a', 1);
            assertEquals(1, myCard.getNum());
            assertEquals(myCard.getSort(), 'a');
        }
        catch (Exception e){
            System.out.println("Exception Thrown");
        }
    }

    @Test
    void makeCardException(){
        try {
            Card myCard1 = new Card('d', -1);
            Card myCard2 = new Card('k', 1);
        }
        catch (Exception e){
            System.out.println("Exception Thrown");
            assertTrue(e instanceof ValueException, "Wrong Exception is thrown");

        }
    }

    @Test
    void twoCardsEQ() throws ValueException {
            Card myCard1 = new Card('d', 11);
            Card myCard2 = new Card('D', 11);
            System.out.println(myCard1.getCardNameShort() + myCard2.getCardNameShort());
            assertEquals(myCard1, myCard2);

        }

    @Test
    void twoValuesEQ() throws ValueException {
        Card myCard1 = new Card('d', 8);
        Card myCard2 = new Card('D', 8);
        assertEquals(myCard1.getNum(), myCard2.getNum());
    }

    @Test
    void twoSortsEQ() throws ValueException {
        Card myCard1 = new Card('d', 8);
        Card myCard2 = new Card('D', 8);
        assertEquals(myCard1.getSort(), myCard2.getSort());
    }
}
