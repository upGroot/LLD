package LLD.AirlineManagementSystem.Payment;

public class Payment {
    PaymentType paymentType;
    public Payment(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public boolean makePayment() {
        return paymentType.makePayment();
    }
}
