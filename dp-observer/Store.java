
import Obserable.StockObserable;
import Obserable.IphoneObserable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Store {

  public static void main(String[] args) {
    StockObserable iphoneStockObserable = new IphoneObserable();

    NotificationAlertObserver obj1 = new EmailAlertObserver("nvnv@gmail.com", iphoneStockObserable);
    NotificationAlertObserver obj2 = new MobileAlertObserver("+91988746345", iphoneStockObserable);

    iphoneStockObserable.add(obj2);
    iphoneStockObserable.add(obj1);

    iphoneStockObserable.setStockCount(10);
  }
}