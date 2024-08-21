package LLD.TurfBookingSystem.Booking;

import LLD.TurfBookingSystem.*;
import LLD.TurfBookingSystem.User.*;

public class Booking {
    private String bookingId;
    private User bookedUser;
    private Turf bookedTurf;
    private Slot bookedSlot;

    public Booking(String bookingId, User bookedUser, Turf bookedTurf, Slot bookedSlot) {
        this.bookingId = bookingId;
        this.bookedUser = bookedUser;
        this.bookedTurf = bookedTurf;
        this.bookedSlot = bookedSlot;
    }
}
