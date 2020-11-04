package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;

public class App {
  public static void main(String[] args) {
    Factory factory = Factory.getFactory("abstract_factory.listfactory.ListFactory");

    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.com");

    Tray trayNews = factory.createTray("新聞");
    trayNews.add(asahi);
    trayNews.add(yomiuri);

    Link yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
    Link excite = factory.createLink("excite", "http://excite.com");
    Link google = factory.createLink("google", "http://google.com");

    Tray traySites = factory.createTray("サイト");
    traySites.add(yahoo);
    traySites.add(excite);
    traySites.add(google);

    Page page = factory.createPAge("LinkPage", "テスト太郎");
    page.add(trayNews);
    page.add(traySites);
    page.output();
  }
}
