package com.rokumura;

import java.util.*;

public class Table {
  private List<Card> cards = new ArrayList<>();
  public void dispose(List<Card> duplicateCards) {
    duplicateCards.stream().forEach(c ->  {
      System.out.println(c + " was disposed.");
      cards.add(c);
    });
  }
}