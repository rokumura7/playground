package com.rokumura;

import java.util.*;

public class Player {
  protected String name;
  protected Hand hand = new Hand();

  public Player(String name) {
    this.name = name;
  }

  public Hand showHand() {
    return hand;
  }

  public void addCard(Card card) {
    hand.addCard(card);
  }

  public void draw(Player nextPlayer) {
    Card card = nextPlayer.holdOutCard();
    System.out.println(this + " draw " + card + " from " + nextPlayer);
    addCard(card);
  }

  public Card holdOutCard() {
    Random random = new Random();
    return hand.pickCard(random.nextInt(hand.countCards()));
  }

  public List<Card> throwAwayDuplicateCards() {
    List<Card> cards = hand.findDuplicateNumberCards();
    System.out.println("Duplicate => " + cards);
    cards.stream().forEach(card -> hand.pick(card));
    return cards;
  }

  public boolean declareWin() {
    boolean isWin = hand.countCards() == 0;
    if (isWin) {
      System.out.println(this + " has no more cards.");
    }
    return isWin;
  }

  @Override
  public String toString() {
    return name;
  }
}