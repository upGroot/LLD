package LLD.AirlineManagementSystem;

import LLD.AirlineManagementSystem.Booking.*;
import LLD.AirlineManagementSystem.Payment.*;
import LLD.AirlineManagementSystem.User.*;

import java.util.*;

public class AirlineManagementService {
    BookingController bookingController;
    List<Passenger> passengerList;
    PaymentController paymentController;
    FlightController flightController;
    public AirlineManagementService() {
        passengerList = new ArrayList<>();
        bookingController = BookingController.getInstance();
        paymentController = new PaymentController();
        flightController = new FlightController();
    }
    public List<Flight> searchFlights() {
        return null;
    }

    public Booking bookFlight(Date date, Flight flight, User bookedUser) {
        return null;
    }
    public BookingStatus cancelFlight(Flight flight, User bookedUser) {
        return null;
    }
    public boolean makePayment(PaymentType paymentType) {
        return paymentController.makePayment(paymentType);
    }
    public void initiateRefund(User bookedUser) {

    }
}
