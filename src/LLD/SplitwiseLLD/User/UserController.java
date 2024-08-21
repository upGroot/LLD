package LLD.SplitwiseLLD.User;

import java.util.*;

public class UserController {
    List<User> userList;
    public UserController() {
        userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUserById(int id) {

    }
    public User getUserById(String id) {
        for (User user : userList) {
            if (user.getUserId().equals(id))
                return user;
        }
        return null;
    }
    public List<User> getAllUsers() {
        return userList;
    }
}
