package abstract_factory.listfactory;

import abstract_factory.factory.Tray;
import iterator.Iterator;

public class ListTray extends Tray {
  public ListTray(String caption) {
    super(caption);
  }
  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("<li>\n");
    buffer.append(caption).append("\n");

    buffer.append("<ul>");
    tray.forEach(item -> buffer.append(item.makeHTML()));
    buffer.append("</ul>");
    buffer.append("</li>");
    return buffer.toString();
  }
}
