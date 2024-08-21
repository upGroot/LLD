package LLD.ConcertTicketBookingSystem;

import java.util.*;

public class UserController {
    List<User> userList;
    public static UserController userController;
    public UserController() {
        userList = new ArrayList<>();
    }
    public static synchronized UserController getInstance() {
        if (userController == null)
            userController = new UserController();
        return userController;
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {

    }
    public User getUserById(String id) {
        for (User user : userList) {
            if (user.getUserId().equalsIgnoreCase(id))
                return user;
        }
        return null;
    }
}
