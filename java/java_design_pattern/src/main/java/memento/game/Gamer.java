package memento.game;

import java.util.*;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitname = {
            "りんご", "ぶどう", "ばなな", "みかん"
    };
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金が増えました");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金が半分になりました");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("フルーツ（" + f + "）をもらいました");
            fruits.add(f);
        } else {
            System.out.println("何も起こりませんでした");
        }
    }
    public Memento createMemento() {
        Memento m = new Memento(money);
        fruits.stream().filter(f -> f.startsWith("美味しい")).forEach(m::addFruit);
        return m;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) prefix = "美味しい";
        return prefix + fruitname[random.nextInt(fruitname.length)];
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
