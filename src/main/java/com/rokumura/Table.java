package com.rokumura;

import java.util.*;

public class Table {
  private List<Card> cards = new ArrayList<>();
  public void dispose(Card... card) {
    Arrays.asList(card).stream().forEach(c -> {
      System.out.println(c + " was disposed.");
      cards.add(c);
    });
  }
}