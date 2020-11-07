package bridge;

import java.util.stream.IntStream;

public class StringDisplayImpl extends DisplayImpl {
  private String str;
  private int width;
  public StringDisplayImpl(String str) {
    this.str = str;
    this.width = str.length();
  }
  @Override
  public void rawOpen() {
    printLine();
  }

  @Override
  public void rawPrint() {
    System.out.println("|" + str + "|");
  }

  @Override
  public void rawClose() {
    printLine();
  }
  private void printLine() {
    System.out.print("+");
    IntStream.range(0, width).forEach(i -> System.out.print("-"));
    System.out.println("+");
  }
}
