package model;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Deck {
    private List<PlayingCard> cards;

    public Deck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                System.out.println( "creating a card of "+rank + " of " + suit);
                cards.add(new PlayingCard(rank, suit));
            }
        }
        shuffle();
    }
    public void shuffle(){
        Random rand=new Random();
        for(int i=0; i<cards.size(); ++i){
            Collections.swap(cards, i, rand.nextInt(cards.size()));
        }
    

}
  public PlayingCard removeCard(){
      return cards.remove(0);
  }
    public void addCard(PlayingCard card){
        cards.add(card);
    }

    public List<PlayingCard> getCards(){
        return this.cards;
    }
}