import DeckOfCards.Card;
import DeckOfCards.Rank;
import DeckOfCards.Suit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {

    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Game game;

    @Before
    public void before(){
        game = new Game();
        dealer = new Dealer();
        player1 = new Player("Bob");
        player2 = new Player("John");
        game.addPlayers(player1, player2);

    }

    @Test
    public void canAddPlayers(){
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void canDealCardsToPlayers(){
        game.dealTheCards();
        assertEquals(true, player1.hasCards());
    }

    @Test
    public void calculatesWhoWon(){
        Card card1 = new Card(Rank.ACE, Suit.DIAMONDS);
        Card card2 = new Card(Rank.EIGHT, Suit.SPADES);
        player1.getHand(card1);
        player2.getHand(card2);
        assertEquals("The winner is John with the EIGHT of SPADES", game.whoWon());

    }

}
