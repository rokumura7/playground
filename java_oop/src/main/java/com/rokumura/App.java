package com.rokumura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
  public static void main( String[] args) {
    Judge judge = new Judge();

    List<Player> players = recruitPlayers();
    if (players.size() < 2) throw new RuntimeException("Lack of players...");
    judge.startJanken(players);
  }

  private static List<Player> recruitPlayers() {
    String[] people = {"Jacob","Sophia","Mason","Emma","Ethan","Isabella"};
    Random random = new Random();
    int randomNum = random.nextInt(people.length);
    List<Player> players = new ArrayList<>();
    for (int i = 0; i < randomNum; i++) {
      players.add(new Player(people[i], new RandomTactics()));
    }
    return players;
  }
}