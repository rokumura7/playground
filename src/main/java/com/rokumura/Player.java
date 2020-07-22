package com.rokumura;

import java.util.*;

public class Player {
  protected String name;
  protected Hand hand;

  public Player(String name) {
    this.name = name;
  }

  public void addCard(Card card) {
    hand.addCard(card);
  }

  public void draw(Player nextPlayer) {
    Card card = nextPlayer.holdOutCard();
    addCard(card);
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
    return name;
  }
}