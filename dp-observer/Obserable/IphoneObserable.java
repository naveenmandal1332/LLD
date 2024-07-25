
package Obserable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneObserable implements StockObserable {

  public List<NotificationAlertObserver> observerList = new ArrayList<>();
  public int stockCount = 0;

  @Override
  public void add(NotificationAlertObserver observer) {
    System.out.println("Product Added!");
    observerList.add(observer);
  }

  @Override
  public void remove(NotificationAlertObserver observer) {
    System.out.println("Product remove!");
    observerList.remove(observer);
  }

  @Override
  public void notifySubscriber() {
    System.out.println("Notify the subscriber");

    for (NotificationAlertObserver observer : observerList) {
      observer.update();
    }
  }

  public void setStockCount(int stock) {
    System.out.println("Set product!");
    if (stockCount == 0)
      notifySubscriber();
    stockCount += stock;
  }

  public int getStockCount() {
    System.out.println("get product!");
    return stockCount;
  }
}