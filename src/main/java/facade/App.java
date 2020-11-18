package facade;

import facade.pagemaker.PageMaker;

public class App {
  public static void main(String[] args) {
    PageMaker.makeWelcomePage("aaa@com", "welcome.html");
  }
}
