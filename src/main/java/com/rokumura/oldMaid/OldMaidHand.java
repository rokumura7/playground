package com.rokumura.oldMaid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rokumura.core.Card;
import com.rokumura.core.Hand;

public class OldMaidHand extends Hand {
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
}