package abstract_factory.tablefactory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;

public class TableFactory extends Factory {
  @Override
  public Link createLink(String caption, String url) {
    return new TableLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new TableTray(caption);
  }

  @Override
  public Page createPAge(String title, String author) {
    return new TablePage(title, author);
  }
}
