package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
  private String name;
  private List<Entry> directory = new ArrayList<>();
  public Directory(String name) {
    this.name = name;
  }
  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return directory.stream().mapToInt(Entry::getSize).sum();
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    directory.forEach(entry -> entry.printList(prefix + "/" + name));
  }
}
