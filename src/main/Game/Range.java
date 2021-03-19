package main.Game;

import java.util.HashMap;

public class Range {
    HashMap<HandCategory, Boolean> myRange;

    public Range(){
        myRange = emptyRange();

    }

    public Range(HashMap<HandCategory, Boolean> newRange){
        myRange = newRange;
        
    }

    private HashMap<HandCategory, Boolean> emptyRange() {
        return null;

    }


}
