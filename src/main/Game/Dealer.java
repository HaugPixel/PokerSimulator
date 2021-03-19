package main.Game;

import main.Game.Players.IPlayer;

public class Dealer {
    private Deck currentDeck;
    private int rake;
    private Table currentTable;


    public Dealer(Table table){
        currentTable = table;
    }

    public void dealPlayers() throws ValueException {
        currentDeck = new Deck();
        currentDeck.shuffleDeck();

    }



}
