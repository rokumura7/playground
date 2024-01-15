package abstract_factory.tablefactory;

import abstract_factory.factory.Tray;

public class TableTray extends Tray {
  public TableTray(String caption) {
    super(caption);
  }
  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("<td>");
    buffer.append("<table><tr>");
    buffer.append("<td colspan=\"").append(tray.size()).append("\">").append(caption).append("</td>");
    buffer.append("</tr>\n");

    buffer.append("<tr>");
    tray.forEach(item -> buffer.append(item.makeHTML()));
    buffer.append("</tr></table>");
    buffer.append("</td>");
    return buffer.toString();
  }
}
