package LLD.InventoryManagement;

import java.util.*;

public class Inventory {
    List<ProductCategory> productCategories;

    public Inventory() {
        productCategories = new ArrayList<>();
    }

    public void addCategory(int categoryId, String name, int price) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.price = price;
        productCategory.categoryName = name;
        productCategory.categoryId = categoryId;
        productCategories.add(productCategory);

    }
    public void addProductCategory(Product product, int productCategoryId) {
        for (ProductCategory productCategory : productCategories) {
            if (productCategory.categoryId == productCategoryId)
            {
                productCategory.addProduct(product);
                break;
            }
        }
    }

    public void removeProductCategoryById(int id) {

    }

    public void removeItems(Map<Integer, Integer> productCategoryAndCountMap) {

    }
    private ProductCategory getProductCategoryFromID(int productCategoryId){

        for(ProductCategory productCategory : productCategories){

            if(productCategory.categoryId == productCategoryId){
                return productCategory;
            }
        }

        return null;
    }

}
