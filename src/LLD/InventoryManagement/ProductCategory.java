package LLD.InventoryManagement;

import java.util.*;

public class ProductCategory {
    int categoryId;
    String categoryName;
    double price;
    List<Product> products;
    public ProductCategory() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(int id) {

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
