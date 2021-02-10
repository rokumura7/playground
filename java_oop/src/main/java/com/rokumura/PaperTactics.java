package com.rokumura;

public class PaperTactics implements Tactics {
  @Override
  public Hands readTactics() {
    return Hands.PAPER;
  }
}