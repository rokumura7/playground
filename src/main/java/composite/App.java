package composite;

public class App {
  public static void main(String[] args) {
    try {
      System.out.println("Making root entries...");
      Directory rootDir = new Directory("root");

      Directory binDir = new Directory("bin");
      Directory tmpDir = new Directory("tmp");
      Directory usrDir = new Directory("usr");
      rootDir.add(binDir);
      rootDir.add(tmpDir);
      rootDir.add(usrDir);

      binDir.add(new File("vi", 1000));
      binDir.add(new File("latex", 2000));
      rootDir.printList();

      System.out.println("Making user entries...");
      Directory aaaDir = new Directory("aaa");
      Directory bbbDir = new Directory("bbb");
      Directory cccDir = new Directory("ccc");
      usrDir.add(aaaDir);
      usrDir.add(bbbDir);
      usrDir.add(cccDir);

      aaaDir.add(new File("diary.html", 100));
      aaaDir.add(new File("Composite.java", 500));
      bbbDir.add(new File("memo.txt", 50));
      cccDir.add(new File(".hoge", 5000));

      rootDir.printList();

    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
