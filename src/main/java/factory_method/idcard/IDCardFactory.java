package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
  private List<Product> owners = new ArrayList<>();
  @Override
  protected Product createProduct(String string) {
    return new IDCard(string);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(product);
  }

  public List getOwners() {
    return owners;
  }
}
