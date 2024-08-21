package LLD.ObserverDesignPattern.Observer;

import LLD.ObserverDesignPattern.Observable.StocksObservable;

public class MobileNotification implements NotificationAlert{
    String mobileNumber;
    StocksObservable stocksObservable;
    public MobileNotification(String mobileNumber, StocksObservable stocksObservable) {
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void notifyStocksAvailibility() {
        sendMessage(mobileNumber);
    }
    public void sendMessage(String mobileNumber) {
        System.out.println(stocksObservable.getMessage() + " message sent to mobile number : " + mobileNumber);
    }
}
