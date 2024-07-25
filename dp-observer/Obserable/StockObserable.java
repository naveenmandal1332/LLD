package Obserable;

import Observer.NotificationAlertObserver;

public interface StockObserable {

  public void add(NotificationAlertObserver observer);

  public void remove(NotificationAlertObserver observer);

  public void notifySubscriber();

  public void setStockCount(int stock);

  public int getStockCount();
}