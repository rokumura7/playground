package com.rokumura;

import java.util.*;

public class App {
  public static void main( String[] args ){
    Table table = new Table();
    ParentPlayer parent = new ParentPlayer("Parent");
    Player playerA = new Player("Player A");
    Player playerB = new Player("Player B");
    Player playerC = new Player("Player C");
    List<Player> players = Arrays.asList(parent, playerA, playerB, playerC);

    Hand deck = parent.prepareDeck();
    parent.passOutCards(players, deck);

    for (int i = 0; players.size() > 1; i++) {
      Player currentPlayer = players.get(i % players.size());
      Player nextPlayer = players.get((i + 1) % players.size());
      currentPlayer.draw(nextPlayer);
      if (nextPlayer.declareWin()) {
        players.remove(i + 1);
      }
      if (players.size() == 1) {
        Player loser = players.get(0);
        System.out.println(loser + " lose");
      }
      List<Card> duplicateCards = currentPlayer.throwAwayDuplicateCards();
      table.dispose(duplicateCards);
      if (currentPlayer.declareWin()) {
        players.remove(i);
      }
      if (players.size() == 1) {
        Player loser = players.get(0);
        System.out.println(loser + " lose");
      }
    }
  }

  private void startGame() {

  }
}
