package LLD.ObserverDesignPattern;

import LLD.ObserverDesignPattern.Observable.*;
import LLD.ObserverDesignPattern.Observer.*;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStocks = new IphoneStock();
        StocksObservable macBookStocks = new MacBook();
        NotificationAlert mobileNotification1 = new MobileNotification("93044", iphoneStocks);
        NotificationAlert emailNotification1 = new EmailNotification("wdcs@gmail.com", macBookStocks);
        NotificationAlert mobileNotification2 = new MobileNotification("763382", macBookStocks);
        NotificationAlert emailNotification2 = new EmailNotification("abcc@gmail.com", iphoneStocks);
        iphoneStocks.setMessage("New Iphone 15 pro are available now....");
        iphoneStocks.addStocks(mobileNotification1);
        macBookStocks.addStocks(emailNotification1);
        macBookStocks.addStocks(mobileNotification2);
        macBookStocks.setMessage("New MacBook Air M2 is available now..");
        iphoneStocks.addStocks(emailNotification2);
        iphoneStocks.setStockCount(10);
        macBookStocks.setStockCount(5);
    }
}