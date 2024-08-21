package LLD.TurfBookingSystem.User;

import LLD.TurfBookingSystem.Booking.*;

import java.util.*;

public class UserController {
    private List<User> userList;
    public static UserController instance;
    private UserController() {
        userList = new ArrayList<>();
    }
    public static UserController getInstance() {
        if (instance == null) {
            synchronized (UserController.class) {
                if (instance == null)
                    instance = new UserController();
            }
        }
        return instance;
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public User getUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }
}
