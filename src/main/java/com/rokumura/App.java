package com.rokumura;

import java.util.*;

public class App {
  public static void main( String[] args ){
    System.out.println("PREPARE.");
    ParentPlayer parent = new ParentPlayer("Parent");
    List<Player> players = recruitPlayers(parent);
    if (players.size() == 1) throw new RuntimeException("Nobody joined...");

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
    startGame(players);
  }

  private static void startGame(List<Player> players) {
    Table table = new Table();
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
      if (isFinish(players)) {
        break;
      }
      List<Card> duplicateCards = currentPlayer.throwAwayDuplicateCards();
      table.dispose(duplicateCards);
      if (currentPlayer.declareWin()) {
        players.remove(currentPlayer);
      }
      if (isFinish(players)) {
        break;
      }
    }
    System.out.println("END.");
  }

  private static boolean isFinish(List<Player> players) {
    if (players.size() == 1) {
      Player loser = players.get(0);
      System.out.println(loser + " lose");
      return true;
    }
    return false;
  }

  private static List<Player> recruitPlayers(Player parent) {
    List<Player> players = new ArrayList<>();
    players.add(parent);
    players.add(new Player("player 1"));
    players.add(new Player("player 2"));
    players.add(new Player("player 3"));
    return players;
  }
}
