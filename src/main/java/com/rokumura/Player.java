package com.rokumura;

public class Player {
  private String name;
  private Tactics tactics;
  private int winCount;
  private Hands hand;

  public Player(String name, Tactics tactics) {
    this.name = name;
    this.tactics = tactics;
  }

  public String getName() {
    return name;
  }

  public void decideHand() {
    hand = tactics.readTactics();
  }

  public Hands showHand() {
    return hand;
  }

  public void addWinCount() {
    winCount++;
  }

  public int getWinCount() {
    return winCount;
  }

  @Override
  public String toString() {
    return name;
  }
}