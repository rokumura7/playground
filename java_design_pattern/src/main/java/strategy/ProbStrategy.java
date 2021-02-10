package strategy;

import java.util.Arrays;
import java.util.Random;

public class ProbStrategy implements Strategy {
  private final Random random;
  private int prevHandValue = 0;
  private int currentHandValue = 0;
  private final int[][] history = {
          { 1, 1, 1 },
          { 1, 1, 1 },
          { 1, 1, 1 }
  };

  public ProbStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    int bet = random.nextInt(getSum(currentHandValue));
    int handValue = 0;
    if (bet < history[currentHandValue][0]) {
      handValue = 0;
    } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
      handValue = 1;
    } else {
      handValue = 2;
    }
    prevHandValue = currentHandValue;
    currentHandValue = handValue;
    return Hand.getHand(handValue);
  }

  private int getSum(int hv) {
    return Arrays.stream(history[hv], 0, 3).sum();
  }

  @Override
  public void study(boolean win) {
    if (win) history[prevHandValue][currentHandValue]++;
    else {
      history[prevHandValue][(currentHandValue + 1) % 3]++;
      history[prevHandValue][(currentHandValue + 2) % 3]++;
    }
  }
}
