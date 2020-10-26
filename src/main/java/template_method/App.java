package template_method;

public class App {
  public static void main(String[] args) {
    AbstractDisplay d1 = new CharDisplay('A');
    d1.display();

    AbstractDisplay d2 = new StringDisplay("Hello, World.");
    d2.display();
  }
}
