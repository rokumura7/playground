package strategy;

public class Hand {
  public static final int HAND_GUU = 0;
  public static final int HAND_CHO = 1;
  public static final int HAND_PAA = 2;
  public static final Hand[] hand = {
          new Hand(HAND_GUU),
          new Hand(HAND_CHO),
          new Hand(HAND_PAA)
  };
  private static final String[] name = {
          "グー", "チョキ", "パー"
  };
  private final int handValue;
  private Hand(int handValue) {
    this.handValue = handValue;
  }
  public static Hand getHand(int handValue) {
    return hand[handValue];
  }
  public boolean isStrongerThan(Hand hand) {
    return fight(hand) == 1;
  }
  public boolean isWeakerThan(Hand hand) {
    return fight(hand) == -1;
  }

  private int fight(Hand h) {
    if (this == h) return 0;
    else if ((this.handValue + 1) % 3 == h.handValue) return 1;
    else return -1;
  }

  @Override
  public String toString() {
    return name[handValue];
  }
}
