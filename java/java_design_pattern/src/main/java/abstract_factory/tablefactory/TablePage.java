package abstract_factory.tablefactory;

import abstract_factory.factory.Page;

public class TablePage extends Page {
  public TablePage(String title, String author) {
    super(title, author);
  }
  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("<html><head><title>").append(title).append("</title></head>\n");
    buffer.append("<body>\n");
    buffer.append("<h1>").append(title).append("</h1>");

    buffer.append("<table>\n");
    content.forEach(item -> buffer.append("<tr>").append(item.makeHTML()).append("</tr>\n"));
    buffer.append("</table>");

    buffer.append("<hr><address>").append(author).append("</address>");

    buffer.append("</body></html>\n");

    return buffer.toString();
  }
}
