package com.rokumura;

public class App {
  public static void main( String[] args) {
    Judge judge = new Judge();
    Player p1 = new Player("John");
    Player p2 = new Player("Mike");
    judge.startJanken(p1, p2);
  }
}