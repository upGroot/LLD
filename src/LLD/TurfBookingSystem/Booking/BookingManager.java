package LLD.TurfBookingSystem.Booking;

import LLD.TurfBookingSystem.*;
import LLD.TurfBookingSystem.User.*;
import java.util.*;

public class BookingManager {
    List<Booking> bookingList;
    public BookingManager() {
        bookingList = new ArrayList<>();
    }
    public void createBooking(User bookedUser, Slot slotToBook, Turf bookedTurf) {
        Booking booking = new Booking(genrateBookingId(), bookedUser, bookedTurf, slotToBook);
        bookingList.add(booking);
        bookedUser.addBooking(booking);
    }

    public String genrateBookingId() {
        return "1234";
    }
}
