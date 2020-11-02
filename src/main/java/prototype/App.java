package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class App {
  public static void main(String[] args) {
    Manager manager = new Manager();

    manager.register("Strong Msg", new UnderlinePen('~'));
    manager.register("Warning Box", new MessageBox('*'));
    manager.register("Slash Box", new MessageBox('/'));

    Product p1 = manager.create("Strong Msg");
    Product p2 = manager.create("Warning Box");
    Product p3 = manager.create("Slash Box");

    p1.use("Hello.");
    p2.use("Hello.");
    p3.use("Hello.");
  }
}
