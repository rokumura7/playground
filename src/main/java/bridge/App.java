package bridge;

public class App {
  public static void main(String[] args) {
    Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
    Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
    d1.display();
    d2.display();
    d3.multiDisplay(2);
  }
}
