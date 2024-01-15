package com.rokumura.player;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import com.rokumura.card.Card;
import com.rokumura.card.Hand;
import com.rokumura.card.Card.Suit;

public class ParentPlayer extends Player {
  public ParentPlayer(String name) {
    super(name);
  }

  public void passOutCards(List<Player> players, Hand deck) {
    IntStream.range(0, deck.countCards()).forEach(i -> {
      Random random = new Random();
      Card card = deck.pickCard(random.nextInt(deck.countCards()));
      Player player = players.get(i % players.size());
      player.addCard(card);
    });
  }

  public Hand prepareDeck() {
    Hand deck = new Hand();
    IntStream.range(1, 14).forEach(i -> {
      deck.addCard(new Card(Suit.SPADE, i));
      deck.addCard(new Card(Suit.HEART, i));
      deck.addCard(new Card(Suit.DIAMOND, i));
      deck.addCard(new Card(Suit.CLUB, i));
    });
    deck.addCard(new Card(Suit.JOKER, 0));
    deck.shuffleCards();
    return deck;
  }

  @Override
  public String toString() {
    return name + "[PARENT]";
  }
}