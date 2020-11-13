import DeckOfCards.Card;
import DeckOfCards.Rank;
import DeckOfCards.Suit;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    private ArrayList<Card> hand;
    private Player player;
    private Card card;
    private Card card1;
    private Card card2;
    private Card card3;

    @Before
    public void before(){
        player = new Player("Bob");
        card = new Card(Rank.ACE, Suit.DIAMONDS);
        card1 = new Card(Rank.ACE, Suit.SPADES);
        card2 = new Card(Rank.FIVE, Suit.HEARTS);
        card3 = new Card(Rank.TEN, Suit.DIAMONDS);
    }

    @Test
    public void canAddCardToHand(){
        player.addCardToHand(card);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    public void canPlayCard(){
        player.addCardToHand(card);
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        player.addCardToHand(card3);
        assertEquals(card2, player.playCard(2));
    }

//    @Test
//    public void canShowAllCards(){
//        player.addCardToHand(card);
//        player.addCardToHand(card1);
//        player.addCardToHand(card2);
//        player.addCardToHand(card3);
//
//        assertEquals(4, cards.size());
//    }
}
