package LLD.ObserverDesignPattern.Observer;

import LLD.ObserverDesignPattern.Observable.StocksObservable;

public class EmailNotification implements NotificationAlert{
    private String email;
    private StocksObservable stocksObservable;
    public EmailNotification(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void notifyStocksAvailibility() {
        sendEmail(email);
    }
    private void sendEmail(String email) {
        System.out.println(stocksObservable.getMessage() + " email sent to email id : " + email);
    }
}
