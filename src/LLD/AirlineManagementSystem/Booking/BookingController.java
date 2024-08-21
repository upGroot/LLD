package LLD.AirlineManagementSystem.Booking;

import LLD.BookMyShow.*;

import java.util.*;

public class BookingController {
    public static BookingController instance;
    private final Object lock = new Object();
    Map<String, Booking> bookingIdToBookingList;
    public BookingController() {
        bookingIdToBookingList = new HashMap<>();
    }
    public static synchronized BookingController getInstance() {
        if (instance == null) {
            instance = new BookingController();
        }
        return instance;
    }
    public Booking createBooking() {
        Booking booking = new Booking();
        synchronized (lock) {
            bookingIdToBookingList.put("1211", booking);
        }
        return booking;
    }
    public void cancelBooking() {

    }
    public void selectSeat(Seat seat) {

    }
    public Booking getBookingById(String id) {
        return null;
    }
}
