package com.rokumura;

public class RandomTactics implements Tactics {
  @Override
  public Hands readTactics() {
    double randomNum = Math.random() * 3;
    if (randomNum < 1) {
      return Hands.STONE;
    } else if (randomNum < 2) {
      return Hands.SCISSORS;
    } else {
      return Hands.PAPER;
    }
  }
}