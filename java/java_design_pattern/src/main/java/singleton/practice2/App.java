package singleton.practice2;

public class App {
  public static void main(String[] args) {
    Triple t0 = Triple.getInstance(0);
    Triple t1 = Triple.getInstance(1);
    Triple t2 = Triple.getInstance(2);
    Triple t2_1 = Triple.getInstance(2);

    System.out.println(t0);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t2_1);
  }
}
