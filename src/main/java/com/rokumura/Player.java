package com.rokumura;

public class Player {
  private String name;
  private int winCount;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Hands showHand() {
    double randomNum = Math.random() * 3;
    if (randomNum < 1) {
      return Hands.STONE;
    } else if (randomNum < 2) {
      return Hands.SCISSORS;
    } else {
      return Hands.PAPER;
    }
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