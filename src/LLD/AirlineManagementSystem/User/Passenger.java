package LLD.AirlineManagementSystem.User;

import LLD.AirlineManagementSystem.*;
import LLD.AirlineManagementSystem.Booking.*;

import java.util.*;

public class Passenger extends User{
    private String passengerId;
    List<Booking> bookingHistory;
    AirlineManagementService airlineManagementService;
    public Passenger(String userName, String userAddress, AirlineManagementService airlineManagementService) {
        super(userName, userAddress);
        this.airlineManagementService = airlineManagementService;
    }

    public List<Flight> searchFlight(String source, String destination, String date) {
        return null;
    }
    public void makeBooking(Flight flight) {

    }
    public void cancelBooking(String bookingId) {

    }
}
