package model;

public enum Suit {
    HEARTS(1),
    DIAMONDS(2),
    CLUBS(3),
    SPADES(4);

    int value;

    private  Suit(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
    
}
