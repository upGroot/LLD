package LLD.HotelManagementSystem.Payment;

public class CardPayment implements Payment {
    private String number;
    private String expiryDate;
    private String CVV;

    public CardPayment(String number, String expiryDate, String CVV) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }
    public boolean makePayment() {
        return true;
    }
}
