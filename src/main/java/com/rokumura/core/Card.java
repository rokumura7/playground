package com.rokumura.core;

public class Card {
  private Suit suit;
  private int number;

  public Card(Suit suit, int number) {
    this.suit = suit;
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    switch (suit) {
      case SPADE:
        sb.append("SPADE");
        break;
      case HEART:
        sb.append("HEART");
        break;
      case DIAMOND:
        sb.append("DIAMOND");
        break;
      case CLUB:
        sb.append("CLUB");
        break;
      case JOKER:
        return "JOKER";
    }
    sb.append("_");
    switch (number) {
      case 1:
        sb.append("ACE");
        break;
      case 11:
        sb.append("JACK");
        break;
      case 12:
        sb.append("QUEEN");
        break;
      case 13:
        sb.append("KING");
        break;
      default:
        sb.append(number);
        break;
    }
    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (this.getClass() != obj.getClass()) return false;
    Card card = (Card) obj;
    return this.suit.equals(card.suit) && this.number == card.getNumber();
  }
}