package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class App {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=== " + i);
            System.out.println("現状：" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("　　　（増えたので、現状を保存しておこう）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("　　　（減ったので、以前の状態を復元しよう）");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
