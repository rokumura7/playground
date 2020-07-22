package com.rokumura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import java.util.List;
import java.util.Arrays;

public class HandTest {
  @Test
  public void testAddCard() {
    Hand hand = prepareHand();
    hand.addCard(new Card(Suit.SPADE, 13));
    assertEquals(6, hand.countCards());
  }

  @Test
  public void testPickCard() {
    Hand hand = prepareHand();
    Card card = hand.pickCard(0);
    assertEquals("♠️A", card.toString());
  }

  @Test
  public void testShuffleCards() {
    Hand hand = prepareHand();
    hand.shuffleCards();
    assertNotEquals(prepareHand(), hand);
  }

  @Test
  public void testCountCards() {
    Hand hand = prepareHand();
    assertEquals(5, hand.countCards());
  }

  @Test
  public void testFindDuplicateNumberCards() {
    Hand hand = prepareHand();
    hand.addCard(new Card(Suit.HEART, 2));
    List<Card> actual = hand.findDuplicateNumberCards();
    assertThat(actual, hasSize(2));
    assertThat(
      actual,
      containsInAnyOrder(new Card(Suit.SPADE,2), new Card(Suit.HEART,2))
    );
  }

  private Hand prepareHand() {
    Hand hand = new Hand();
    hand.addCard(new Card(Suit.SPADE, 1));
    hand.addCard(new Card(Suit.SPADE, 2));
    hand.addCard(new Card(Suit.SPADE, 3));
    hand.addCard(new Card(Suit.SPADE, 4));
    hand.addCard(new Card(Suit.JOKER, 0));
    return hand;
  }
}