package com.rokumura.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Hand {
  protected List<Card> cards = new ArrayList<>();
  public int countCards() {
    return cards.size();
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public void shuffleCards() {
    for (int i = 0; i < cards.size() * 2; i++) {
      Card pickedCard = pickCard((int)Math.random() * cards.size());
      addCard(pickedCard);
    }
  }

  private Card pickCard(int index) {
    return cards.remove(index);
  }

  private boolean pick(Card card) {
    return cards.remove(card);
  }

  @Override
  public String toString() {
    return cards.stream().map(c -> c + ",").collect(Collectors.joining());
  }
}