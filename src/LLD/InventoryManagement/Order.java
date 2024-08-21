package LLD.InventoryManagement;

import java.util.*;

public class Order {
    int orderId;
    User user;
    Map<Integer, Integer> productCategoryIdVsCountMap;
    WareHouse wareHouse;
    Payment payment;
    Invoice invoice;
    OrderStatus orderStatus;

    public Order(User user, WareHouse wareHouse) {
        this.user = user;
        this.wareHouse = wareHouse;
        productCategoryIdVsCountMap = user.getUserCartDetails().productCategoryIdVsCountMap;
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public void checkout() {
        wareHouse.removeItemFromInventory(productCategoryIdVsCountMap);
        if (makePayment(new UPIPaymentMode())) user.getUserCartDetails().emptyCart();
        else wareHouse.addItemToInventory(productCategoryIdVsCountMap);

    }
    public boolean makePayment(PaymentMode paymentMode) {
        payment = new Payment(paymentMode);
        return payment.makePayment();
    }
    public void generateOrderInvoice(){
        invoice.generateInvoice(this);
    }
}
