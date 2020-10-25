package adapter.pattern2;

public class PrintBanner extends Print {
  private Banner banner;
  public PrintBanner(String string) {
    banner = new Banner(string);
  }
  @Override
  public void printWeek() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
