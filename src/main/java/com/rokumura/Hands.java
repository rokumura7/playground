package com.rokumura;

public enum Hands {
  STONE, SCISSORS, PAPER;
  @Override
  public String toString() {
    return this.name();
  }
}