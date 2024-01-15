package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class App {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product p1 = factory.create("ユーザーA");
    Product p2 = factory.create("ユーザーB");
    Product p3 = factory.create("ユーザーC");
    Product p4 = factory.create("ユーザーD");

    p1.use();
    p2.use();
    p3.use();
    p4.use();
  }
}
