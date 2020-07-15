package com.rokumura;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main( String[] args) {
    Judge judge = new Judge();

    List<Player> players = new ArrayList<>();
    players.add(new Player("John", new RandomTactics()));
    players.add(new Player("Mike", new RandomTactics()));
    players.add(new Player("Alex", new RandomTactics()));
    players.add(new Player("Paul", new RandomTactics()));

    judge.startJanken(players);
  }
}