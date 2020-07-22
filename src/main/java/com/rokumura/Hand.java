package com.rokumura;

import java.util.*;
import java.util.stream.Collectors;

public class Hand {
  private List<Card> cards = new ArrayList<>();

  public void addCard(Card card) {
    cards.add(card);
  }

  public Card pickCard(int index) {
    return cards.remove(index);
  }

  public boolean pick(Card card) {
    return cards.remove(card);
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
    for (int i = 0; i < cards.size(); i++) {
      Card c1 = cards.get(i);
      for (int j = i + 1; j < cards.size(); j++) {
        Card c2 = cards.get(j);
        if (c1.getNumber() == c2.getNumber()) {
          result.add(c1);
          result.add(c2);
        }
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return cards.stream().map(c -> c + ",").collect(Collectors.joining());
  }
}