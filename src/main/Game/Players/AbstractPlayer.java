package main.Game.Players;
import main.Game.Card;

public class AbstractPlayer {

    protected Card[] hand;
    protected double stack;


    AbstractPlayer(double stack) {
        this.stack = stack;

    }


    void setStack(double change) {
        this.stack = change;
    }

    void addStack(double change) {
        this.stack = this.stack + change;
    }

    double bet(double amount) {
        double temp = this.stack;
        this.stack = Math.min(this.stack - amount, 0);
        return Math.min(this.stack, amount);
    }
}
