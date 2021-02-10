package adapter.pattern1;

public class PrintBanner extends Banner implements Print {
  public PrintBanner(String string) {
    super(string);
  }

  @Override
  public void printWeek() {
    showWithParen();
  }

  @Override
  public void ptintStrong() {
    showWithAster();
  }
}
