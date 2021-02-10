package visitor;

public class App {
  public static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      Directory tmpdir = new Directory("tmp");
      Directory usrdir = new Directory("usr");

      rootdir.add(bindir);
      rootdir.add(tmpdir);
      rootdir.add(usrdir);

      bindir.add(new File("vi", 1000));
      bindir.add(new File("latex", 2000));
      rootdir.accept(new ListVisitor());

      System.out.println("");
      System.out.println("Making user entries...");
      Directory a = new Directory("a");
      Directory b = new Directory("b");
      Directory c = new Directory("c");
      usrdir.add(a);
      usrdir.add(b);
      usrdir.add(c);

      a.add(new File("diary.txt", 100));
      a.add(new File("memo.txt", 200));
      b.add(new File("todo.txt", 300));
      c.add(new File("doc.txt", 400));
      c.add(new File("game.txt", 1000));
      rootdir.accept(new ListVisitor());
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
