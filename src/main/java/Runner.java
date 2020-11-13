import DeckOfCards.Deck;

import static java.lang.String.format;

public class Runner {

    public static void main(String[] args) {
    Game game = new Game();
    Player susie = new Player("Susie");
    Player bob = new Player("Bob");
    game.addPlayers(bob, susie);
    game.dealTheCards();
    System.out.println(game.whoWon());


    }
}
