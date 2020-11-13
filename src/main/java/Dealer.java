import DeckOfCards.Card;
import DeckOfCards.Deck;


public class Dealer {

    private Deck deck;


    public Dealer(){
        deck = new Deck();
        deck.fillDeck();
        deck.shuffleDeck();
    }


    public Card dealTopCard(){
        return deck.dealTopCard();
    }
}
