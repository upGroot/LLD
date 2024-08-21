package LLD.HotelManagementSystem.Payment;

public class UPIPayment implements Payment{
    private String upiId;
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    public boolean makePayment() {
        return true;
    }
}
