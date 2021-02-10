package com.rokumura;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Judge {
  public void startJanken(List<Player> players) {
    System.out.println("Let’s play stone-paper-scissors");
    for (int i = 1; i <= 5; i++) {
      System.out.println("\nRound " + i);
      players.stream().forEach(p -> p.decideHand());
      List<Player> winners = judgeJanken(players);
      if (winners != null && !winners.isEmpty()) {
        winners.stream().forEach(w -> {
          w.addWinCount();
          System.out.println(w + " won.");
        });
      } else {
        System.out.println("draw");
      }
    }

    Player winner = judgeResult(players);
    if (winner != null) {
      System.out.println(winner + " won.");
    } else {
      System.out.println("draw");
    }
  }

  private List<Player> judgeJanken(List<Player> players) {
    Map<Hands, List<Player>> map = players.stream().collect(Collectors.groupingBy(Player::showHand));
    System.out.println(map);
    if (map.size() != 2) {
      return null;
    }
    if (map.containsKey(Hands.STONE) && map.containsKey(Hands.SCISSORS)) {
      return map.get(Hands.STONE);
    } else if (map.containsKey(Hands.SCISSORS) && map.containsKey(Hands.PAPER)) {
      return map.get(Hands.SCISSORS);
    } else if (map.containsKey(Hands.PAPER) && map.containsKey(Hands.STONE)) {
      return map.get(Hands.PAPER);
    }
    throw new RuntimeException("Something wrong!");
  }

  private Player judgeResult(List<Player> players) {
    System.out.println("------------------");
    checkWinCount(players);
    int maxCount = players.stream().max((p1, p2) -> {
      if (p1.getWinCount() > p2.getWinCount()) return 1;
      else if (p1.getWinCount() < p2.getWinCount()) return -1;
      else return 0;
    }).get().getWinCount();
    List<Player> winners = players.stream()
      .filter(p -> p.getWinCount() == maxCount)
      .collect(Collectors.toList());
    if (winners.size() != 1) return null;
    return winners.get(0);
  }

  private void checkWinCount(List<Player> players) {
    players.stream().forEach(p -> System.out.println(p+":"+p.getWinCount()));
  }
}