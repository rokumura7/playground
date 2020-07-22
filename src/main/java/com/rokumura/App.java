package com.rokumura;

import java.util.*;

public class App {
  public static void main( String[] args ){
    System.out.println("PREPARE.");
    Table table = new Table();
    ParentPlayer parent = new ParentPlayer("Parent");
    Player playerA = new Player("Player A");
    Player playerB = new Player("Player B");
    Player playerC = new Player("Player C");

    List<Player> players = new ArrayList<>();
    players.add(parent);
    players.add(playerA);
    players.add(playerB);
    players.add(playerC);

    Hand deck = parent.prepareDeck();
    System.out.println(deck);
    System.out.println("======================");
    parent.passOutCards(players, deck);

    players.forEach(player -> {
      System.out.println("-----");
      System.out.println(player);
      System.out.println(player.showHand());
      player.throwAwayDuplicateCards();
      System.out.println(player.showHand());
    });

    System.out.println("======================");
    System.out.println("START");
    for (int i = 0; players.size() > 1; i++) {
      System.out.println("-----");
      Player currentPlayer = players.get(i % players.size());
      Player nextPlayer = players.get((i + 1) % players.size());
      currentPlayer.draw(nextPlayer);
      if (nextPlayer.declareWin()) {
        players.remove(nextPlayer);
      }
      if (players.size() == 1) {
        Player loser = players.get(0);
        System.out.println(loser + " lose");
        break;
      }
      List<Card> duplicateCards = currentPlayer.throwAwayDuplicateCards();
      table.dispose(duplicateCards);
      if (currentPlayer.declareWin()) {
        players.remove(currentPlayer);
      }
      if (players.size() == 1) {
        Player loser = players.get(0);
        System.out.println(loser + " lose");
        break;
      }
    }
    System.out.println("END.");
  }
}
