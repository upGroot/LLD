package LLD.ObserverDesignPattern.Observable;

import LLD.ObserverDesignPattern.Observer.NotificationAlert;

import java.util.*;

public class MacBook implements StocksObservable{
    private int totalStock = 0;
    private List<NotificationAlert> notificationAlertList = new ArrayList<>();
    private String message;
    @Override
    public void addStocks(NotificationAlert notificationAlert) {
        notificationAlertList.add(notificationAlert);
    }

    @Override
    public void removeStocks(NotificationAlert notificationAlert) {
        notificationAlertList.remove(notificationAlert);
    }

    @Override
    public void notifyCustomer() {
        for (NotificationAlert notificationAlert : notificationAlertList) {
            notificationAlert.notifyStocksAvailibility();
        }
    }

    @Override
    public int getStockCount() {
        return this.totalStock;
    }

    @Override
    public void setStockCount(int noOfNewStocks) {
        if (totalStock == 0)
            notifyCustomer();
        totalStock += noOfNewStocks;
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
