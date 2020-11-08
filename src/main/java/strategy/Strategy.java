package strategy;

interface Strategy {
  Hand nextHand();
  void study(boolean win);
}
