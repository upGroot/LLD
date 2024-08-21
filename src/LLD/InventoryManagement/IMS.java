package LLD.InventoryManagement;

public class IMS {
    UserController userController;
    OrderController orderController;
    WareHouseController wareHouseController;
    public IMS() {
        userController = new UserController();
        orderController = new OrderController();
        wareHouseController = new WareHouseController();
        createUser();
        addWarehouseAndItsInventory();
    }

    public void createUser() {
        User user1 = new User("1001", "Ayush", "Kalikanagar");
        User user2 = new User("1002", "Aman", "Mango");
        userController.addUser(user1);
        userController.addUser(user2);
    }
    private void addWarehouseAndItsInventory(){

        WareHouse warehouse = new WareHouse();
        Inventory inventory = new Inventory();

        inventory.addCategory(0001, "Pepsi Large Cold Drink" , 100);
        inventory.addCategory(0004, "Dove small Soap" , 50);

        //CREATE 3 Products

        Product product1 = new Product(1, "Pepsi");

        Product product2 = new Product(2, "Pepsi");

        Product product3 = new Product(3, "Dove");

        inventory.addProductCategory(product1, 0001);
        inventory.addProductCategory(product2, 0001);
        inventory.addProductCategory(product3, 0004);

        warehouse.inventory = inventory;
        wareHouseController.addWareHouse(warehouse);
    }

    public void runDeliverySystem(String userId, WareHouseSelector wareHouseSelector) {
        //Get User Details..
        User currentUser = userController.getUserById(userId);

        // Select the warehouse according to the given strategy..
        WareHouse wareHouse = wareHouseController.selectWareHouse(wareHouseSelector,
                wareHouseController.getAllWareHouse());
        Inventory inventory = wareHouse.inventory;
        ProductCategory productToOrder = null;
        for (ProductCategory product : inventory.productCategories) {
            if (product.categoryName.equalsIgnoreCase("Pepsi Large Cold Drink"))
                productToOrder = product;
        }

        Cart cart = currentUser.getUserCartDetails();
        cart.addItemsToCart(productToOrder.categoryId, 3);
        Order order = orderController.createNewOrder(currentUser, wareHouse);
        order.checkout();
        order.generateOrderInvoice();

    }
}
