package com.rokumura;

import static org.junit.Assert.*;

import org.junit.*;

public class TacticsTest {
  @Test
  public void testStoneTactics() {
    Player player = new Player("test", new StoneTactics());
    player.decideHand();
    assertEquals("STONE", Hands.STONE, player.showHand());
  }

  @Test
  public void testScissorsTactics() {
    Player player = new Player("test", new ScissorsTactics());
    player.decideHand();
    assertEquals("SCISSORS", Hands.SCISSORS, player.showHand());
  }

  @Test
  public void testPaperTactics() {
    Player player = new Player("test", new PaperTactics());
    player.decideHand();
    assertEquals("PAPER", Hands.PAPER, player.showHand());
  }
}
