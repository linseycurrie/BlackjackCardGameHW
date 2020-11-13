import DeckOfCards.Card;

import java.util.ArrayList;

public class Game {

    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(){
        dealer = new Dealer();
        players = new ArrayList<Player>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayers(Player player1, Player player2){
        this.players.add(player1);
        this.players.add(player2);
    }

    public void dealTheCards(){
        for (Player player : players){
            player.getHand(dealer.dealTopCard());
        }
    }

    public String whoWon(){
        Player winner = players.get(0);
        Card winningCard = winner.showHand();
        for (Player player : players){
            if (player.showHand().getRank().getValue() >= winningCard.getRank().getValue()){
                winner = player;
                winningCard = player.showHand();
            }
        }
        return String.format("The winner is %s with the %s of %s", winner.getName(), winningCard.getRank(), winningCard.getSuit());
    }
}
