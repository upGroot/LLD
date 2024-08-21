package LLD.InventoryManagement;

import java.util.*;

public class User {
    String userId;
    String userName;
    Cart userCartDetails;
    List<Integer> orederIds;
    String address;

    public User(String userId, String userName, String address) {
        this.userName = userName;
        this.userId = userId;
        this.address = address;
        userCartDetails = new Cart();
    }
    public Cart getUserCartDetails() {
        return userCartDetails;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Integer> getOrederIds() {
        return orederIds;
    }

    public void setOrederIds(List<Integer> orederIds) {
        this.orederIds = orederIds;
    }
}
