package com.rokumura;

import java.util.*;

public class Hand {
  private List<Card> cards = new ArrayList<>();

  public void addCard(Card card) {
    cards.add(card);
  }

  public Card pickCard(int index) {
    return cards.remove(index);
  }

  public void shuffleCards() {
    for (int i = 0; i < cards.size() * 2; i++) {
      Card pickedCard = pickCard((int)(Math.random() * cards.size()));
      cards.add(pickedCard);
    }
  }

  public int countCards() {
    return cards.size();
  }

  public List<Card> findDuplicateNumberCards() {
    List<Card> result = new ArrayList<>();
    if (cards.size() > 0) {
      Card lastAddedCard = cards.get(cards.size() - 1);
      cards.stream()
        .filter(c -> c.getNumber() == lastAddedCard.getNumber())
        .findFirst()
        .ifPresent(c -> {
          result.add(c);
          result.add(lastAddedCard);
        });
    }
    return result;
  }

  @Override
  public String toString() {
    return cards.stream().map(c -> c + ",").toString();
  }
}