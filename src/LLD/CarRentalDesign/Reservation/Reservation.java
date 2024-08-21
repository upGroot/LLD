package LLD.CarRentalDesign.Reservation;

import LLD.CarRentalDesign.*;
import LLD.CarRentalDesign.User.*;
import LLD.CarRentalDesign.Vehicle.*;

import java.util.*;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;


    public Reservation makeReservation(Vehicle vehicle, User user) {
        return null;
    }
}
