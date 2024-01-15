package factory_method.idcard;

import factory_method.framework.Product;

public class IDCard extends Product {
  private int serial;
  private String owner;
  IDCard(String owner, int serial) {
    System.out.println(owner + "(" + serial + ")" + "のカードを作ります");
    this.owner = owner;
    this.serial =serial;
  }
  @Override
  public void use() {
    System.out.println(owner + "(" + serial + ")" + "のカードを使います");
  }
  public String getOwner() {
    return owner;
  }
  public int getSerial() {
    return serial;
  }
}
