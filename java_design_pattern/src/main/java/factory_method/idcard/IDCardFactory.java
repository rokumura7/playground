package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

import java.util.*;

public class IDCardFactory extends Factory {
  private Map<Integer, String> database = new HashMap<>();
  private int serial = 100;
  @Override
  protected synchronized Product createProduct(String string) {
    return new IDCard(string, serial++);
  }

  @Override
  protected void registerProduct(Product product) {
    IDCard card = (IDCard) product;
    database.put(card.getSerial(), card.getOwner());
  }

  public Map<Integer, String> getDatabase() {
    return database;
  }
}
