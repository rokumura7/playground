package com.rokumura;

import java.util.*;

public class Player {
  private String name;
  private boolean isParent;
  private Hand hand;

  public Player(String name) {
    this.name = name;
  }

  public void draw(Player nextPlayer) {
    Card card = nextPlayer.holdOutCard();
    hand.addCard(card);
  }

  public Card holdOutCard() {
    Random random = new Random();
    return hand.pickCard(random.nextInt(hand.countCards()));
  }

  public List<Card> throwAwayDuplicateCards() {
    return hand.findDuplicateNumberCards();
  }

  public boolean declareWin() {
    return hand.countCards() == 0;
  }

  @Override
  public String toString() {
    return name + (isParent ? "[PARENT]" : "");
  }
}