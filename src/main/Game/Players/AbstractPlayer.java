package main.Game.Players;
import main.Game.Card;

public class AbstractPlayer implements IPlayer{

    protected Card[] hand;
    protected double stack;

    AbstractPlayer(double stack) {
        this.stack = stack;

    }

    AbstractPlayer() {
        this.stack = 200.0;

    }

    @Override
    public String getName() {
        return "erlend";
    }

    @Override
    public double getStack() {
        return this.stack;
    }

    public void setStack(double stack_size) {
        this.stack = stack_size;
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
