package LLD.InventoryManagement;

public class Main {
    public static void main(String[] args){
      //
        IMS productDelivery = new IMS();
        productDelivery.runDeliverySystem("1001", new CheapestWareHouse());
    }
}
