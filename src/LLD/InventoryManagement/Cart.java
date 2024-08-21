package LLD.InventoryManagement;

import java.util.*;

public class Cart {
    Map<Integer, Integer> productCategoryIdVsCountMap;
    public Cart() {
        productCategoryIdVsCountMap = new HashMap<>();
    }
    public void addItemsToCart(int productCategoryId, int count) {
        productCategoryIdVsCountMap.put(productCategoryId,
                productCategoryIdVsCountMap.getOrDefault(productCategoryId, 0) + count);
    }
    public void removeItemsFromCart(int productCategoryId, int count) {
        int currentCountOfProduct = productCategoryIdVsCountMap.get(productCategoryId);
        currentCountOfProduct -= count;
        if (currentCountOfProduct == 0)
            productCategoryIdVsCountMap.remove(productCategoryId);
        else
            productCategoryIdVsCountMap.put(productCategoryId, currentCountOfProduct);
    }
    public void emptyCart() {
        productCategoryIdVsCountMap = new HashMap<>();
    }
}
