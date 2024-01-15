package abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
  protected String title;
  protected String author;
  protected List<Item> content = new ArrayList<>();
  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }
  public void add(Item item) {
    this.content.add(item);
  }
  public void output() {
    try {
      String filename = title + ".html";
      Writer writer = new FileWriter(filename);
      writer.write(this.makeHTML());
      writer.close();
    } catch (IOException e) {
      e.getStackTrace();
    }
  }
  public abstract String makeHTML();
}
