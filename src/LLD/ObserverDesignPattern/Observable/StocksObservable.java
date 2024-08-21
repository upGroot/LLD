package LLD.ObserverDesignPattern.Observable;

import LLD.ObserverDesignPattern.Observer.*;

public interface StocksObservable {
    void addStocks(NotificationAlert notificationAlert);
    void removeStocks(NotificationAlert notificationAlert);
    void notifyCustomer();
    int getStockCount();
    void setStockCount(int noOfNewStocks);
    void setMessage(String message);
    String getMessage();
}
