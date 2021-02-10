package strategy;

import java.util.stream.IntStream;

public class App {
  public static void main(String[] args) {
    Player p1 = new Player("AAA", new WinningStrategy(314));
    Player p2 = new Player("BBB", new ProbStrategy(15));

    for (int i = 0; i < 1000; i++) {
      Hand nextHand1 = p1.nextHand();
      Hand nextHand2 = p2.nextHand();
      if (nextHand1.isStrongerThan(nextHand2)) {
        System.out.println("winner : " + p1);
        p1.win();
        p2.lose();
      } else if (nextHand2.isStrongerThan(nextHand1)) {
        System.out.println("winner : " + p2);
        p2.win();
        p1.lose();
      } else {
        System.out.println("even...");
        p1.even();
        p2.even();
      }
    }
    System.out.println("Total result : ");
    System.out.println(p1);
    System.out.println(p2);
  }
}
