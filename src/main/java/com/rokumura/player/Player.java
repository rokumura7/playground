package com.rokumura.player;

import java.util.List;
import java.util.Random;

import com.rokumura.card.Card;
import com.rokumura.card.Hand;

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
    addCard(card);
  }

  public Card holdOutCard() {
    Random random = new Random();
    return hand.pickCard(random.nextInt(hand.countCards()));
  }

  public List<Card> throwAwayDuplicateCards() {
    List<Card> cards = hand.findDuplicateNumberCards();
    cards.stream().forEach(card -> hand.pick(card));
    return cards;
  }

  public boolean declareWin() {
    boolean isWin = hand.countCards() == 0;
    return isWin;
  }

  @Override
  public String toString() {
    return name;
  }
}