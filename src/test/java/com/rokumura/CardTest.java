package com.rokumura;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {
  @Test
  public void testJoker() {
    Card card = new Card(Suit.JOKER, 0);
    assertEquals("🃏", card.toString());
  }

  @Test
  public void testSpadeKing() {
    Card card = new Card(Suit.SPADE, 13);
    assertEquals("♠️K", card.toString());
  }

  @Test
  public void testHeartQueen() {
    Card card = new Card(Suit.HEART, 12);
    assertEquals("❤︎Q", card.toString());
  }

  @Test
  public void testDiamondJack() {
    Card card = new Card(Suit.DIAMOND, 11);
    assertEquals("♦︎J", card.toString());
  }

  @Test
  public void testClubAce() {
    Card card = new Card(Suit.CLUB, 1);
    assertEquals("☘A", card.toString());
  }

  @Test
  public void testSpadeTwo() {
    Card card = new Card(Suit.SPADE, 2);
    assertEquals("♠️2", card.toString());
  }
}