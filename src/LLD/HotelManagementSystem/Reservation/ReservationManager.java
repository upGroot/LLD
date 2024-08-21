package LLD.HotelManagementSystem.Reservation;

import LLD.HotelManagementSystem.*;
import LLD.HotelManagementSystem.Room.*;

import java.util.*;

public class ReservationManager {
    private List<Reservation> reservationList;

    private ReservationManager() {
        reservationList = new ArrayList<>();
    }

    private static final class InstanceHolder {
        static final ReservationManager instance = new ReservationManager();
    }

    public static ReservationManager getInstance() {
        return InstanceHolder.instance;
    }
    public Reservation makeReservation(Guest bookedGuest, Room bookedRoom) {
        return null;
    }
    public boolean cancelReservation() {
        return true;
    }
}
