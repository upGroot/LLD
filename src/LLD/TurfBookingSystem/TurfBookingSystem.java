package LLD.TurfBookingSystem;

import LLD.TurfBookingSystem.Booking.*;
import LLD.TurfBookingSystem.User.*;

import java.util.*;

public class TurfBookingSystem {
    public static TurfBookingSystem instance;
    private BookingManager bookingManager;
    private UserController userController;
    private TurfManager turfManager;
    private TurfBookingSystem() {
        bookingManager = new BookingManager();
        userController = UserController.getInstance();
        turfManager = TurfManager.getInstance();
    }
    public static TurfBookingSystem getInstance() {
        if (instance == null) {
            synchronized (TurfManager.class) {
                if (instance == null)
                    instance = new TurfBookingSystem();
            }
        }
        return instance;
    }
    public void demo() {
        User user = new User(100, "Ayush");
        List<Turf> getAllTurfByLocation = turfManager.getTurfByLocationId(123);
        Turf turfToBook = getAllTurfByLocation.get(0);
        List<Slot> availableSlots = turfToBook.getAllAvailableSlots();
        Slot slotToBook = availableSlots.get(0);
        makeBooking(user, slotToBook, turfToBook);
    }
    public synchronized void makeBooking(User bookedUser, Slot slotToBook, Turf bookedTurf) {
        if (makePayment(bookedUser)) {
            slotToBook.setStatus(SlotStatus.BOOKED);
            bookingManager.createBooking(bookedUser, slotToBook, bookedTurf);
            System.out.println("Your booking was successfully completed...");
        }
        else System.out.println("Payment failed");
    }
    public boolean makePayment(User user) {
        return true;
    }
    public void addUser(User user) {
        userController.addUser(user);
    }
    public void addTurf(Turf turf) {
        turfManager.addTurf(turf);
    }
}
