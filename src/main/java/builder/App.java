package builder;

public class App {
  public static void main(String[] args) {
    Builder textBuilder = new TextBuilder();
    Builder htmlBuilder = new HTMLBuilder();

    System.out.println(test(textBuilder));
    System.out.println(test(htmlBuilder));
  }

  private static String test(Builder builder) {
    Director director = new Director(builder);
    director.construct();
    return director.getResult();
  }
}
