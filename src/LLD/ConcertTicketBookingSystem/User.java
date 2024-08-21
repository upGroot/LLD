package LLD.ConcertTicketBookingSystem;

import java.util.*;

public class User {
    private String userId;
    private String userName;
    List<Concert> bookedConcert;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        bookedConcert = new ArrayList<Concert>();
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
}
