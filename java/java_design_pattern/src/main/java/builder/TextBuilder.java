package builder;

public class TextBuilder implements Builder {
  private final StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    buffer.append("=========================\n");
    buffer.append("『").append(title).append("』");
    buffer.append("\n");
  }

  @Override
  public void makeString(String str) {
    buffer.append("■").append(str).append("\n");
    buffer.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    for (String item : items) {
      buffer.append(item);
    }
    buffer.append("\n");
  }

  @Override
  public void close() {
    buffer.append("=========================\n");
  }

  @Override
  public String getResult() {
    return buffer.toString();
  }
}
