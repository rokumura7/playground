package com.rokumura;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.*;
import java.util.*;

public class JudgeTest {
  @Test
  public void testJudgeResult() throws Exception {
    Player p1 = new Player("winner", new RandomTactics());
    p1.addWinCount();
    Player p2 = new Player("loser", new RandomTactics());
    List<Player> players = new ArrayList<>();
    players.add(p1);
    players.add(p2);

    Judge judge = new Judge();
    Method judgeResult = Judge.class.getDeclaredMethod("judgeResult", List.class);
    judgeResult.setAccessible(true);

    assertEquals("winner is p1", p1, judgeResult.invoke(judge, players));
  }
}
