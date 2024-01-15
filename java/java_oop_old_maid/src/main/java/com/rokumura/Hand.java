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
    List<Card> copy = cards.stream().collect(Collectors.toList());
    for (int i = 0; i < copy.size();) {
      Card card = copy.get(i);
      List<Card> duplicates = findDuplicateNumberCards(card, copy);
      if (duplicates.size() > 0) {
        duplicates.stream().forEach(c -> {
          copy.remove(c);
          result.add(c);
        });
        continue;
      }
      i++;
    }
    return result;
  }

  private List<Card> findDuplicateNumberCards(Card card, List<Card> cards) {
    List<Card> result = new ArrayList<>();
    cards.stream()
      .filter(c -> c.getNumber() == card.getNumber())
      .filter(c -> !c.equals(card))
      .findFirst()
      .ifPresent(c -> {
        result.add(c);
        result.add(card);
    });
    return result;
  }

  @Override
  public String toString() {
    return cards.stream().map(c -> c + ",").collect(Collectors.joining());
  }
}