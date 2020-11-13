import DeckOfCards.Card;

import java.util.ArrayList;

public class Player{

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void getHand(Card card) {
        this.hand.add(card);
    }

    public boolean hasCards(){
        if (hand.size() > 0){
            return true;
        }
        return false;
    }


    public int getNumberOfCards() {
        return this.hand.size();
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

    public Card showHand(){
        for ( Card eachCard : hand){
            return eachCard;
        }
        return null;
    }

    public Card playCard(int index){
        return this.hand.get(index);
    }
}
