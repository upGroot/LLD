package LLD.ObserverDesignPattern.Observable;

import LLD.ObserverDesignPattern.Observer.*;

import java.util.*;

public class IphoneStock implements StocksObservable{
    private List<NotificationAlert> observerList = new ArrayList<>();
    private int stockCount = 0;
    private String message;
    @Override
    public void addStocks(NotificationAlert notificationAlert) {
        observerList.add(notificationAlert);
    }

    @Override
    public void removeStocks(NotificationAlert notificationAlert) {
        observerList.remove(notificationAlert);
    }

    @Override
    public void notifyCustomer() {
        for (NotificationAlert observer : observerList) {
            observer.notifyStocksAvailibility();
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void setStockCount(int noOfNewStocks) {
        if (stockCount == 0)
            notifyCustomer();
        stockCount += noOfNewStocks;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
