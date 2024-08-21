package LLD.InventoryManagement;

import java.util.*;

public class UserController {
    List<User> userList;

    public UserController() {
        this.userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public User getUserById(String userId) {
        for (User user : userList) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }
    public void removeUserById(String id) {

    }
}
