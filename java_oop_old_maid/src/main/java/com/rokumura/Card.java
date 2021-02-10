package com.rokumura;

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
        sb.append("♠️");
        break;
      case HEART:
        sb.append("❤︎");
        break;
      case DIAMOND:
        sb.append("♦︎");
        break;
      case CLUB:
        sb.append("☘");
        break;
      case JOKER:
        return "🃏";
    }
    switch (number) {
      case 1:
        sb.append("A");
        break;
      case 11:
        sb.append("J");
        break;
      case 12:
        sb.append("Q");
        break;
      case 13:
        sb.append("K");
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
    Card card = (Card)obj;
    return this.suit.equals(card.suit) && this.number == card.number;
  }
}