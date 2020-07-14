package com.rokumura;

public class Judge {
  public void startJanken(Player p1, Player p2) {
    System.out.println("3回勝負！ジャンケンを開始します！");
    for (int i = 1; i <= 3; i++) {
      System.out.println(i + "回目！");
      Player winner = judgeJanken(p1, p2);
      if (winner != null) {
        winner.notifyResult(true);
      } else {
        System.out.println("引き分け！");
      }
    }

    System.out.println(p1.getName() + ":" + p1.getWinCount());
    System.out.println(p2.getName() + ":" + p2.getWinCount());
    if (p1.getWinCount() > p2.getWinCount()) {
      System.out.println(p1.getName() + "の勝ち！");
    } else if (p2.getWinCount() > p1.getWinCount()) {
      System.out.println(p2.getName() + "の勝ち！");
    } else {
      System.out.println("引き分け！");
    }
  }

  private Player judgeJanken(Player p1, Player p2) {
    Hands p1Hand = p1.showHand();
    System.out.println(p1.getName() + "：" + p1Hand);
    Hands p2Hand = p2.showHand();
    System.out.println(p2.getName() + "：" + p2Hand);

    if (
      (p1Hand.equals(Hands.STONE) && p2Hand.equals(Hands.SCISSORS))
      || (p1Hand.equals(Hands.SCISSORS) && p2Hand.equals(Hands.PAPER))
      || (p1Hand.equals(Hands.PAPER) && p2Hand.equals(Hands.STONE))
    ) {
      return p1;
    } else if (
      (p2Hand.equals(Hands.STONE) && p1Hand.equals(Hands.SCISSORS))
      || (p2Hand.equals(Hands.SCISSORS) && p1Hand.equals(Hands.PAPER))
      || (p2Hand.equals(Hands.PAPER) && p1Hand.equals(Hands.STONE))
    ) {
      return p2;
    }
    return null;
  }
}