package com.rokumura;

public class Player {
  private String name;
  private Tactics tactics;
  private int winCount;

  public Player(String name, Tactics tactics) {
    this.name = name;
    this.tactics = tactics;
  }

  public String getName() {
    return name;
  }

  public Hands showHand() {
    return tactics.readTactics();
  }

  public void notifyResult(boolean isWin) {
    if (isWin) {
      winCount++;
    }
  }

  public int getWinCount() {
    return winCount;
  }
}