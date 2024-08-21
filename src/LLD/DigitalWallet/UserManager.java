package LLD.DigitalWallet;

import java.util.*;

public class UserManager {
    List<User> allUsers;
    public UserManager(){
        allUsers = new ArrayList<>();
    }
    public User findUserById(String id) {
        for (User user : allUsers) {
            if (user.getId().equalsIgnoreCase(id)) return user;
        }
        return null;
    }
    public void removeUserById(String id) {
        //remove user...
    }
}
