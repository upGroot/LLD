package LLD.TurfBookingSystem.User;

import LLD.TurfBookingSystem.Booking.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
public class User {
    private int id;
    private String name;
    private List<Booking> listOfBooking;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        listOfBooking = new ArrayList<>();
    }
    public void addBooking(Booking booking) {
        listOfBooking.add(booking);
    }
}
