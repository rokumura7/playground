package decorator;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpDownBorder extends Border {
  protected UpDownBorder(Display display) {
    super(display);
  }

  @Override
  public int getColumns() {
    return display.getColumns();
  }

  @Override
  public int getRows() {
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0 || row == display.getRows() + 1) return makeLine(display.getColumns());
    else return display.getRowText(row - 1);
  }

  private String makeLine(int count) {
    return IntStream.range(0, count).mapToObj(i -> "-").collect(Collectors.joining());
  }
}
