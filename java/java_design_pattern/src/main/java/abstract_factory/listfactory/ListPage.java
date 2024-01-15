package abstract_factory.listfactory;

import abstract_factory.factory.Page;

public class ListPage extends Page {
  public ListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("<html><head><title>").append(title).append("</title></head>\n");
    buffer.append("<body>\n");
    buffer.append("<h1>").append(title).append("</h1>");

    buffer.append("<ul>");
    content.forEach(item -> buffer.append(item.makeHTML()));
    buffer.append("</ul>");

    buffer.append("<hr><address>").append(author).append("</address>");
    buffer.append("</body></html>\n");

    return buffer.toString();
  }
}
